/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.Analysis;

@SuppressWarnings("nls")
public final class AGtLevel6 extends PLevel6 {
	private PLevel6 _left_;
	private TGt _gt_;
	private PLevel5 _right_;

	public AGtLevel6() {
		// Constructor
	}

	public AGtLevel6(@SuppressWarnings("hiding") PLevel6 _left_,
			@SuppressWarnings("hiding") TGt _gt_, @SuppressWarnings("hiding") PLevel5 _right_) {
		// Constructor
		setLeft(_left_);

		setGt(_gt_);

		setRight(_right_);

	}

	public Object clone() {
		return new AGtLevel6(cloneNode(this._left_), cloneNode(this._gt_), cloneNode(this._right_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAGtLevel6(this);
	}

	public PLevel6 getLeft() {
		return this._left_;
	}

	public void setLeft(PLevel6 node) {
		if (this._left_ != null) {
			this._left_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._left_ = node;
	}

	public TGt getGt() {
		return this._gt_;
	}

	public void setGt(TGt node) {
		if (this._gt_ != null) {
			this._gt_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._gt_ = node;
	}

	public PLevel5 getRight() {
		return this._right_;
	}

	public void setRight(PLevel5 node) {
		if (this._right_ != null) {
			this._right_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._right_ = node;
	}

	public String toString() {
		return "" + toString(this._left_) + toString(this._gt_) + toString(this._right_);
	}

	void removeChild(@SuppressWarnings("unused") Node child) {
		// Remove child
		if (this._left_ == child) {
			this._left_ = null;
			return;
		}

		if (this._gt_ == child) {
			this._gt_ = null;
			return;
		}

		if (this._right_ == child) {
			this._right_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	void replaceChild(@SuppressWarnings("unused") Node oldChild,
			@SuppressWarnings("unused") Node newChild) {
		// Replace child
		if (this._left_ == oldChild) {
			setLeft((PLevel6) newChild);
			return;
		}

		if (this._gt_ == oldChild) {
			setGt((TGt) newChild);
			return;
		}

		if (this._right_ == oldChild) {
			setRight((PLevel5) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
