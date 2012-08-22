/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2011 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.components.headertoolbar.actions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Narcis Marcu (narcism@users.sourceforge.net)
 * @version $Id$
 */
public class ConditionalFormattingData extends BaseColumnData {
	
	private int columnIndex;
	private String conditionType;
	private String conditionPattern;
	private String calendarPattern;
	private List<FormatCondition> conditions;
	
	public ConditionalFormattingData() {
		this.conditions = new ArrayList<FormatCondition>();
	}
	
	public int getColumnIndex() {
		return columnIndex;
	}

	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}

	public String getConditionType() {
		return conditionType;
	}

	public void setConditionType(String filterType) {
		this.conditionType = filterType;
	}

	public String getConditionPattern() {
		return conditionPattern;
	}

	public void setConditionPattern(String filterPattern) {
		this.conditionPattern = filterPattern;
	}

	public String getCalendarPattern() {
		return calendarPattern;
	}

	public void setCalendarPattern(String calendarPattern) {
		this.calendarPattern = calendarPattern;
	}

	public List<FormatCondition> getConditions() {
		return conditions;
	}

	public void setConditions(List<FormatCondition> conditions) {
		this.conditions = conditions;
	}

}
