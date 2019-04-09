public class ExpressionTree{
  /*return the expression as an infix notation string with parenthesis*/
  /* The sample tree would be: "(3 + (2 * 10))"     */
   public String toString(){
     if(isValue()){
       return "" + getValue();
     }else{
       return "(" + getLeft().toString() + " " + getOp() + " " + getRight().toString() + ")";
     }
   }

   /*return the expression as a postfix notation string without parenthesis*/
   /* The sample tree would be: "3 2 10 * +"     */
   public String toStringPostfix(){
     if(isValue()){
       return "" + getValue();
     }else{
       return getLeft().toStringPostfix() + " " + getRight().toStringPostfix() + " " + getOp();
     }
   }

   /*return the expression as a prefix notation string without parenthesis*/
   /* The sample tree would be: "+ 3 * 2 10"     */

   public String toStringPrefix(){
     if(isValue()){
       return "" + getValue();
     }else{
       return getOp() + " " + getLeft().toStringPrefix() + " " + getRight().toStringPrefix();
     }
   }



   /*return the value of the specified expression tree*/

   public double evaluate(){
     /*you are to write this method*/
     if(isValue()){
       return getValue();
     }else{
       return apply(getOp(), getLeft().evaluate(), getRight().evaluate());
     }
   }

}
