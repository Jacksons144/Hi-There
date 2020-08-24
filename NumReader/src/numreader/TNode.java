/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numreader;

/**
 *
 * @author 713043
 */
public class TNode {
    
    private int data;
    private TNode nextL;
    private TNode nextR;
    
   
    public void setData(int set){
        this.data = set;
        }
    public int getData() {
        return this.data;
    }
    public TNode getNextL() {
        return this.nextL;
    }
    public void setNextL(TNode LNode) {
        this.nextL = LNode;
    }
    public TNode getNextR() {
        return this.nextR;
    }
    public void setNextR(TNode RNode) {
        this.nextR = RNode;
    }
    }
    

