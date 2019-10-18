package com.vorleak;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    void traverse(ListItem root);
}
