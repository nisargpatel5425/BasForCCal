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

    String ancestors;
    ArrayList<String> descendants;
    HashMap<String, DataMember> dataMembers;
    ArrayList<MethodMember> methodMember;
    ArrayList<String> aggregates;
    ArrayList<String> associates;

    public ArrayList<String> getAggregates() {
        return aggregates;
    }

    public void setAggregates(ArrayList<String> aggregates) {
        this.aggregates = aggregates;
    }

    public ArrayList<String> getAssociates() {
        return associates;
    }

    public void setAssociates(ArrayList<String> associates) {
        this.associates = associates;
    }

    public HashMap<String, DataMember> getDataMembers() {
        return dataMembers;
    }

    public void setDataMembers(HashMap<String, DataMember> dataMembers) {
        this.dataMembers = dataMembers;
    }

    public ArrayList<String> getDescendants() {
        return descendants;
    }

    public void setDescendants(ArrayList<String> descendants) {
        this.descendants = descendants;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public ArrayList<MethodMember> getMethodMember() {
        return methodMember;
    }

    public void setMethodMember(ArrayList<MethodMember> methodMember) {
        this.methodMember = methodMember;
    }

   

}

class DataMember {

    String access;
    String type;
}

class MethodMember {
    String modifier;
    String type;
    String name;
    String args;
}
