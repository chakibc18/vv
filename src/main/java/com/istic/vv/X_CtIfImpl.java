package com.istic.vv;
import spoon.support.reflect.code.*;
import spoon.support.reflect.reference.*;
import spoon.support.reflect.declaration.*;
import spoon.reflect.declaration.CtElement;
 public class X_CtIfImpl extends NODE{
CtIfImpl i_element;
public NODE if_condition;
public NODE then_block;
public NODE else_block;
public X_CtIfImpl (CtElement e, X_CtMethodImpl parent_method,X_CtConstructorImpl parent_constructor, X_CtClassImpl parent_class, X_CtInterfaceImpl parent_interface,X_CtPackageImpl parent_package, NODE  parent,String cls){
this.i_element=( CtIfImpl)  e;
this.node_package= parent_package;
this.node_class= parent_class;
this.node_interface= parent_interface;
this.node_method=parent_method;
this.node_constructor=parent_constructor;
this.parent=parent;
this.node_name=cls;
super.i_element=e;
}

public void expand( MetaNode parent) {
	MetaNode mn_else = new MetaNode(parent);
	MetaNode mn_then = new MetaNode(parent);
	mn_then.WQNodes.add(this.then_block);
	mn_else.WQNodes.add(this.else_block);
	parent.WQNodes.remove(0);
	parent.changed=true;
	parent.NQMetaNodes.add(mn_then);
	parent.NQMetaNodes.add(mn_else);

	}

}
