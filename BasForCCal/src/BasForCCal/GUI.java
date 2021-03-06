package BasForCCal;

import static BasForCCal.BasForCCalParser.postmaint;
import static BasForCCal.BasForCCalParser.premaint;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.antlr.runtime.RecognitionException;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Ashwini Ukarde
 *
 */
public class GUI extends JFrame implements ActionListener {

    static int result;
    static JFrame f;
    static JTextArea t1, t2, t3;
    static String folderPath = "C:\\Users\\kjdes\\Documents\\CECS547\\";
    JMenuBar jMenubar;
    JMenu jMenuFile;
    JMenu jMenuCompare;
    JMenuItem jOpen;
    JMenuItem jOpenCompared;
    JTextArea jTextArea;
    JTextPane textPane;
    JTree tree;
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("root", true);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel ptext1 = new JPanel();
    JPanel ptext2 = new JPanel();
    JPanel ptext3 = new JPanel();
    JPanel ptree = new JPanel();
    StyledDocument document;

    GUI() {

    }

    //Reference Start: https://www.rgagnon.com/javadetails/java-0324.html
    public void getList(DefaultMutableTreeNode node, File f) {
        if (!f.isDirectory()) {
            if (f.getName().endsWith("java") || f.getName().endsWith("txt")) {
                DefaultMutableTreeNode child = new DefaultMutableTreeNode(f);
                node.add(child);
            }
        } else {
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(f);
            node.add(child);
            File fList[] = f.listFiles();
            for (int i = 0; i < fList.length; i++) {
                getList(child, fList[i]);
            }
        }
    }
    //Reference End: https://www.rgagnon.com/javadetails/java-0324.html

    public static void main(String[] args) throws BadLocationException {

        f = new JFrame("frame");

        GUI s = new GUI();
        s.jOpen = new JMenuItem("Open File");
        s.jOpen.addActionListener(s);

        s.jOpenCompared = new JMenuItem("Compare File");
        s.jOpenCompared.addActionListener(s);

        s.jMenuFile = new JMenu("File");
        s.jMenuCompare = new JMenu("Compare");
        s.jMenuFile.add(s.jOpen);
        s.jMenuCompare.add(s.jOpenCompared);
        s.jMenubar = new JMenuBar();
        s.jMenubar.setBounds(0, 0, 1000, 30);
        s.jMenubar.add(s.jMenuFile);
        s.jMenubar.add(s.jMenuCompare);
        t1 = new JTextArea(50, 50);
        t3 = new JTextArea(50, 50);
        t2 = new JTextArea(50, 50);
        s.ptree.setSize(500, 100);
        s.textPane = new JTextPane();
        s.textPane.setSize(50, 50);
        s.add(s.jMenubar);

        File fileRoot = new File(folderPath);

        s.getList(s.root, new File(folderPath));
        s.tree = new JTree(s.root);
        s.tree.setRootVisible(false);

        s.p1.add(s.jMenubar);
        s.ptree.add(((JTree) s.tree), "Center");
        s.tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {

            /* (non-Javadoc)
			 * @see javax.swing.event.TreeSelectionListener#valueChanged(javax.swing.event.TreeSelectionEvent)
             */
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                String path = e.getPath().getLastPathComponent().toString();
                if (path.contains(".txt") || path.contains(".java")) {
                    BufferedReader br;
                    try {
                        br = new BufferedReader(new FileReader(path));

                        String s1 = "", s2 = "";
                        while ((s1 = br.readLine()) != null) {
                            s2 += s1 + "\n";
                        }
                        t2.setText(s2);
                        br.close();
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }

        });
        s.ptext1.add(t1).setBackground(Color.LIGHT_GRAY);;
        s.ptext2.add(t2);
        s.ptext3.add(t3);

        StyleContext context = new StyleContext();
        s.document = new DefaultStyledDocument(context);

        Style style = context.getStyle(StyleContext.DEFAULT_STYLE);

        StyleConstants.setForeground(style, Color.GREEN);
        s.document.insertString(s.document.getLength(), "java2s.com", style);

        StyleConstants.setForeground(style, Color.RED);
        s.document.insertString(s.document.getLength(), "fa.com", style);
        s.textPane = new JTextPane(s.document);
        s.textPane.setEditable(false);

        JSplitPane s3 = new JSplitPane(SwingConstants.VERTICAL, new JScrollPane(s.ptext1), new JScrollPane(s.ptext2));
        JSplitPane s4 = new JSplitPane(SwingConstants.HORIZONTAL, new JScrollPane(s3), new JScrollPane(s.textPane));
        JSplitPane s2 = new JSplitPane(SwingConstants.VERTICAL, new JScrollPane(s.ptree), s4);
        s.p2.add(s2);
        JSplitPane sl = new JSplitPane(SwingConstants.HORIZONTAL, s.p1, s.p2);
        sl.setBounds(0, 0, 1000, 500);
        f.pack();
        f.add(new JScrollPane(sl));

        f.setSize(1500, 1500);

        f.show();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    /* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Example example;
        Path path;
        String folder = "";
        if (e.getSource() == jOpen || e.getSource() == jOpenCompared) {

            String finalFileContent = "";
            JFileChooser selectFiles = new JFileChooser();
            selectFiles.setMultiSelectionEnabled(true);
            int approveOption = selectFiles.showOpenDialog(this);
            if (e.getSource() == jOpen) {
                Random r = new Random();
                int low = 1;
                int high = 100; 
                result = r.nextInt(high - low) + low;
                folder = folderPath + result + "/V1";
            } else {
                folder = folderPath + result + "/V2";
            }
            path = Paths.get(folder);
            int count = 0;
            if (approveOption == JFileChooser.APPROVE_OPTION) {
                try {
                    Files.createDirectories(path);
                    File files[] = selectFiles.getSelectedFiles();
                    int t = 0;
                    while (t++ < files.length) {
                        count++;
                        String filepath = files[t - 1].getPath();
                        String newFileName = files[t - 1].getName();
                        Files.copy(files[t - 1].toPath(), new File(path + "/" + newFileName + ".java").toPath());
                        example = new Example();
                        if (e.getSource() == jOpenCompared && count == 1) {
                            example.parseProg(filepath, path + "/output.txt", true, true);
                        } else if (e.getSource() == jOpenCompared) {
                            example.parseProg(filepath, path + "/output.txt", false, true);
                        } else {
                            example.parseProg(filepath, path + "/output.txt", false, false);
                        }
                    }

                    if (!postmaint.isEmpty()) {
                        compareClass(premaint, postmaint);

                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (RecognitionException e1) {
                    e1.printStackTrace();
                }

            }
            try {
                BufferedReader br = new BufferedReader(new FileReader(path + "/output.txt"));
                String s1 = "", s2 = "";
                while ((s1 = br.readLine()) != null) {
                    s2 += s1 + "\n";
                }
                if (e.getSource() == jOpenCompared) {
                    t2.setText(s2);
                } else {
                    t1.setText(s2);
                }

                br.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void compareClass(HashMap<String, ModelClass> premaint, HashMap<String, ModelClass> postmaint) {
        if (premaint.size() > postmaint.size()) {
            for (Map.Entry<String, ModelClass> entry : premaint.entrySet()) {

                if (!postmaint.containsKey(entry.getKey())) {
                    System.out.println("Class Removed: " + entry.getKey());
                } else {
                    compareDataMembers(entry.getValue(), postmaint.get(entry.getKey()));
                    compareAncestor(entry.getValue().ancestors, postmaint.get(entry.getKey()).ancestors,entry.getKey());
                }

            }
        } else if (premaint.size() < postmaint.size()) {
            for (Map.Entry<String, ModelClass> entry : postmaint.entrySet()) {

                if (!premaint.containsKey(entry.getKey())) {
                    System.out.println("Class Added: " + entry.getKey());
                } else {
                    compareDataMembers(premaint.get(entry.getKey()), entry.getValue());
                    compareAncestor(entry.getValue().ancestors, postmaint.get(entry.getKey()).ancestors,entry.getKey());
                }
            }
        } else {
            for (Map.Entry<String, ModelClass> entry : premaint.entrySet()) {

                compareDataMembers(entry.getValue(), postmaint.get(entry.getKey()));
                compareAncestor(entry.getValue().ancestors, postmaint.get(entry.getKey()).ancestors,entry.getKey());
            }
        }
    }

    private void compareDataMembers(ModelClass pre, ModelClass post) {
        if (pre.dataMembers.size() > post.dataMembers.size()) {
            for (Map.Entry<String, DataMember> entry : pre.dataMembers.entrySet()) {
                if (post.dataMembers.containsKey(entry.getKey())) {
                    if (post.dataMembers.get(entry.getKey()).access != null) {
                        if (!post.dataMembers.get(entry.getKey()).access
                                .equalsIgnoreCase(entry.getValue().access)) {
                            System.out.println("Access modifier changed for " + entry.getKey() + ":");
                            System.out.println(entry.getValue().access + " " + entry.getValue().type + " " + entry.getKey());

}
                    }
                    if (post.dataMembers.get(entry.getKey()).type != null) {
                        if (!post.dataMembers.get(entry.getKey()).type
                                .equalsIgnoreCase(entry.getValue().type)) {
                            System.out.println("Type changed for " + entry.getKey() + ":");
                            System.out.println(entry.getValue().access + " " + entry.getValue().type + " " + entry.getKey());
                        }
                    }
                } else {
                    System.out.println("Data Member removed:");
                    System.out.println(entry.getValue().access + " " + entry.getValue().type + " " + entry.getKey());
                }
            }
        } else if (pre.dataMembers.size() < post.dataMembers.size()) {
            for (Map.Entry<String, DataMember> entry : post.dataMembers.entrySet()) {
                if (pre.dataMembers.containsKey(entry.getKey())) {
                    if (pre.dataMembers.get(entry.getKey()).access != null) {
                        if (!pre.dataMembers.get(entry.getKey()).access
                                .equalsIgnoreCase(entry.getValue().access)) {
                            System.out.println("Access modifier changed for " + entry.getKey() + ":");
                            System.out.println(entry.getValue().access + " " + entry.getValue().type + " " + entry.getKey());
                        }
                    }
                    if (pre.dataMembers.get(entry.getKey()).type != null) {
                        if (!pre.dataMembers.get(entry.getKey()).type
                                .equalsIgnoreCase(entry.getValue().type)) {
                            System.out.println("Type changed for " + entry.getKey() + ":");
                            System.out.println(entry.getValue().access + " " + entry.getValue().type + " " + entry.getKey());
                        }
                    }
                } else {
                    System.out.println("New Data Member added:");
                    System.out.println(entry.getValue().access + " " + entry.getValue().type + " " + entry.getKey());
                }
            }
        }
    }

    private void compareAncestor(String preancestor, String postancestor, String classname) {
        if(!preancestor.equalsIgnoreCase(postancestor)){
            System.out.println("Ancestor changed from "+ preancestor+" to "+ postancestor+" for "+ classname);
        }
    }

}
