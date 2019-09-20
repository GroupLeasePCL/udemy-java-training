package com.company;

public class MyLinkList implements NodeList {
    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int compare = (currentItem.compareTo(item));
            if(compare<0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else {
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            }else if(compare>0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                }else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
            }else {
                System.out.println(item.getValue() +" is already present, no add");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("List is empty");
        }else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
