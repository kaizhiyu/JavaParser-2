/* Generated By:JJTree: Do not edit this line. InterfaceMemberDecl.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javaparser;

public
class InterfaceMemberDecl extends SimpleNode {
  public InterfaceMemberDecl(int id) {
    super(id);
  }

  public InterfaceMemberDecl(JavaParser1_7 p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParser1_7Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=10936afc04b56faa19d9be6cc79c69ff (do not edit this line) */