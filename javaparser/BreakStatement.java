/* Generated By:JJTree: Do not edit this line. BreakStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javaparser;

public
class BreakStatement extends SimpleNode {
  public BreakStatement(int id) {
    super(id);
  }

  public BreakStatement(JavaParser1_7 p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParser1_7Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c13f7d1c8bfebde5af4c81db3a3e4af3 (do not edit this line) */
