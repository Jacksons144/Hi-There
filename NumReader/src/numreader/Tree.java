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
public class Tree {
    
    private TNode root;
    
    public void insert(int in) {
        
        TNode cur;
        
        if (root == null) {
            root.setData(in);
            root.setNextL(null);
            root.setNextR(null);
        }
        else if (in > root.getData()) { // if greater
            while (cur.getNextR()!=null) {
                
            }
        }
          
}
    
}
