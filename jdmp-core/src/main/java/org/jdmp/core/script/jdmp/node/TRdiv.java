/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.Analysis;

@SuppressWarnings("nls")
public final class TRdiv extends Token {
	public TRdiv() {
		super.setText("/");
	}

	public TRdiv(int line, int pos) {
		super.setText("/");
		setLine(line);
		setPos(pos);
	}

	public Object clone() {
		return new TRdiv(getLine(), getPos());
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseTRdiv(this);
	}

	public void setText(@SuppressWarnings("unused") String text) {
		throw new RuntimeException("Cannot change TRdiv text.");
	}
}
