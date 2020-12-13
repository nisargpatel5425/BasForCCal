/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasForCCal;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kjdes
 */
public class ModelClass {
    ArrayList<String> ancestors;
    ArrayList<String> descendants;
    String className;
    HashMap<String, String> variables;
    ArrayList<String> methodMember;

    public ArrayList<String> getDescendants() {
        return descendants;
    }

    public void setDescendants(ArrayList<String> descendants) {
        this.descendants = descendants;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public HashMap<String, String> getVariables() {
        return variables;
    }

    public void setVariables(HashMap<String, String> variables) {
        this.variables = variables;
    }

    public ArrayList<String> getAncestors() {
        return ancestors;
    }

    public void setAncestors(ArrayList<String> ancestors) {
        this.ancestors = ancestors;
    }

    public ArrayList<String> getMethodMember() {
        return methodMember;
    }

    public void setMethodMember(ArrayList<String> methodMember) {
        this.methodMember = methodMember;
    }
}
