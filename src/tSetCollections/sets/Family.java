package tSetCollections.sets;

import tSetCollections.listTasks.Child;

import java.util.List;

public class Family {
    private String surName;
    private List<tSetCollections.listTasks.Child> childList;

    public Family(String surName, List<tSetCollections.listTasks.Child> childList) {
        this.surName = surName;
        this.childList = childList;
    }

    @Override
    public String toString() {
        return "Family{" +
                "surName='" + surName + '\'' +
                ", childList=" + childList +
                '}';
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public List<tSetCollections.listTasks.Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }
}
