/*
 * Copyright 2017 Swedish E-identification Board (E-legitimationsnämnden)
 *  		 
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * 
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 * 
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.tillvaxtverket.tsltrust.common.html.elements;

/**
 * HTML select element
 */
public class SelectElement extends HtmlElement {

    public SelectElement() {
        this("");
    }

    public SelectElement(String id) {
        this.tag = "select";
        if (id.length() > 0) {
            this.addAttribute("id", id);
        }
    }

    public void addOption(String option) {
        addOption(option, "", "", "",false);
    }
    public void addOption(String option, boolean selected) {
        addOption(option, "", "", "",selected);
    }

    public void addOption(String option, String event, String function, String arg, boolean selected) {
        addOption(option, event, function, new String[]{arg}, selected);
    }

    public void addOption(String option, String event, String function, String[] args, boolean selected) {
        HtmlElement optElement = new GenericHtmlElement("option");
        optElement.text = option;
        if (event.length()>0){
            optElement.addAction(event, function, args);
        }
        if (selected){
            optElement.addAttribute("selected", "true");
        }
        addHtmlElement(optElement);
        
    }
}
