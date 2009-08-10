/*
 * Copyright (C) 2008-2009 Holger Arndt, A. Naegele and M. Bundschus
 *
 * This file is part of the Java Data Mining Package (JDMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * JDMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * JDMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with JDMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.jdmp.core.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultObservableMap<V> extends AbstractObservableMap<V> {
	private static final long serialVersionUID = -1811632376295464484L;

	private Map<String, V> map = null;

	public DefaultObservableMap() {
	}

	public DefaultObservableMap(Map<String, V> map) {
		this.map = map;
	}

	public DefaultObservableMap(List<V> list) {
		for (V o : list) {
			add(o);
		}
	}

	@Override
	public Map<String, V> getMap() {
		if (map == null) {
			map = new HashMap<String, V>(2);
		}
		return map;
	}

	@Override
	public void setMap(Map<String, V> map) {
		this.map = map;
	}

}
