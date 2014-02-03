/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABitComplementLevel2 extends PLevel2 {
	private TBitComplement _bitComplement_;
	private PLevel1 _level1_;

	public ABitComplementLevel2() {
		// Constructor
	}

	public ABitComplementLevel2(@SuppressWarnings("hiding") TBitComplement _bitComplement_,
			@SuppressWarnings("hiding") PLevel1 _level1_) {
		// Constructor
		setBitComplement(_bitComplement_);

		setLevel1(_level1_);

	}

	public Object clone() {
		return new ABitComplementLevel2(cloneNode(this._bitComplement_), cloneNode(this._level1_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseABitComplementLevel2(this);
	}

	public TBitComplement getBitComplement() {
		return this._bitComplement_;
	}

	public void setBitComplement(TBitComplement node) {
		if (this._bitComplement_ != null) {
			this._bitComplement_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._bitComplement_ = node;
	}

	public PLevel1 getLevel1() {
		return this._level1_;
	}

	public void setLevel1(PLevel1 node) {
		if (this._level1_ != null) {
			this._level1_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._level1_ = node;
	}

	public String toString() {
		return "" + toString(this._bitComplement_) + toString(this._level1_);
	}

	void removeChild(@SuppressWarnings("unused") Node child) {
		// Remove child
		if (this._bitComplement_ == child) {
			this._bitComplement_ = null;
			return;
		}

		if (this._level1_ == child) {
			this._level1_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	void replaceChild(@SuppressWarnings("unused") Node oldChild,
			@SuppressWarnings("unused") Node newChild) {
		// Replace child
		if (this._bitComplement_ == oldChild) {
			setBitComplement((TBitComplement) newChild);
			return;
		}

		if (this._level1_ == oldChild) {
			setLevel1((PLevel1) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
