package BasForCCal;

import static BasForCCal.BasForCCalParser.classesmodel;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.antlr.runtime.RecognitionException;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Ashwini Ukarde
 *
 */
public class GUI extends JFrame implements ActionListener {

    static JFrame f;
    static JTextArea t1, t2;
    static String folderPath = "/Users/kjdes/Documents/CECS547/Project/";
    JMenuBar jMenubar;
    JMenu jMenu;
    JMenuItem jOpen;
    JTextArea jTextArea;
    JTree tree;
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("root", true);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel ptext = new JPanel();
    JPanel ptree = new JPanel();
    ArrayList<String> ancestor;

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

    public static void main(String[] args) {

        f = new JFrame("frame");

        GUI s = new GUI();
        s.jOpen = new JMenuItem("Open File");
        s.jOpen.addActionListener(s);
        s.jMenu = new JMenu("File");
        s.jMenu.add(s.jOpen);
        s.jMenubar = new JMenuBar();
        s.jMenubar.setBounds(0, 0, 1000, 30);
        s.jMenubar.add(s.jMenu);

        t2 = new JTextArea(50, 50);
        s.ptree.setSize(500, 100);

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
        s.ptext.add(t2);
        JSplitPane s2 = new JSplitPane(SwingConstants.VERTICAL, new JScrollPane(s.ptree), new JScrollPane(s.ptext));
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
        if (e.getSource() == jOpen) {

            String finalFileContent = "";
            JFileChooser selectFiles = new JFileChooser();
            selectFiles.setMultiSelectionEnabled(true);
            int approveOption = selectFiles.showOpenDialog(this);
            Random r = new Random();
            int low = 1;
            int high = 100;
            int result = r.nextInt(high - low) + low;
            path = Paths.get(folderPath + result);
            if (approveOption == JFileChooser.APPROVE_OPTION) {

                try {
                    Files.createDirectories(path);
                    File files[] = selectFiles.getSelectedFiles();
                    int t = 0;
                    while (t++ < files.length) {
                        String filepath = files[t - 1].getPath();
                        String newFileName = files[t - 1].getName();
                        Files.copy(files[t - 1].toPath(), new File(path + "/" + newFileName + ".java").toPath());
                        example = new Example();
                        example.parseProg(filepath, path + "/output.txt");
                        if (!BasForCCalParser.classesmodel.isEmpty()) {
                            for (int i = 0; i < classesmodel.size(); i++) {
                                System.out.println("classes model : " );
                                System.out.println("Classname classes model :  " + classesmodel.get(i).getClassName());
                                System.out.println("Ancestor classes model :  " + classesmodel.get(i).getAncestors());
                            }
                        }
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
                t2.setText(s2);
                br.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
