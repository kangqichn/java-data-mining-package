/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.Analysis;

@SuppressWarnings("nls")
public final class AIdentifierLevel0 extends PLevel0 {
	private PName _name_;

	public AIdentifierLevel0() {
		// Constructor
	}

	public AIdentifierLevel0(@SuppressWarnings("hiding") PName _name_) {
		// Constructor
		setName(_name_);

	}

	public Object clone() {
		return new AIdentifierLevel0(cloneNode(this._name_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAIdentifierLevel0(this);
	}

	public PName getName() {
		return this._name_;
	}

	public void setName(PName node) {
		if (this._name_ != null) {
			this._name_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._name_ = node;
	}

	public String toString() {
		return "" + toString(this._name_);
	}

	void removeChild(@SuppressWarnings("unused") Node child) {
		// Remove child
		if (this._name_ == child) {
			this._name_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	void replaceChild(@SuppressWarnings("unused") Node oldChild,
			@SuppressWarnings("unused") Node newChild) {
		// Replace child
		if (this._name_ == oldChild) {
			setName((PName) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
