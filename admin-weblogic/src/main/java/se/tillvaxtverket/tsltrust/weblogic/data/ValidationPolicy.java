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
package se.tillvaxtverket.tsltrust.weblogic.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Validation policy database record data class
 */
public class ValidationPolicy implements Serializable {

    private Gson gson = new Gson();
    private static final Type listStringType = new TypeToken<List<String>>() {
    }.getType();
    public static final String ENABLE_STATE = "enable";
    public static final String DISABLE_STATE = "disable";
    public static final String RECONSTRUCT_STATE = "reconstruct";
    public static final String REMOVE_STATE = "remove";
    public static final String PENDING_STATE = "pending";
    public static final String[] POLICY_STATE = new String[]{ENABLE_STATE, DISABLE_STATE, RECONSTRUCT_STATE, REMOVE_STATE, PENDING_STATE};
    private String policyName = "", status = "", description = "";
    List<String> tslPolicies = new ArrayList<String>();
    List<String> addCertIds = new ArrayList<String>();
    List<String> blockCertIds = new ArrayList<String>();
    String tslPoliciesStr;
    String addCertIdsStr;
    String blockCertIdsStr;

    public ValidationPolicy(String policyName) {
        this.policyName = policyName;
    }

    public ValidationPolicy() {
    }

    //toString
    @Override
    public String toString() {
        return policyName;
    }

    public String getAddCertIdsStr() {
        this.addCertIdsStr = gson.toJson(addCertIds);
        return addCertIdsStr;
    }

    public String getBlockCertIdsStr() {
        this.blockCertIdsStr = gson.toJson(blockCertIds);
        return blockCertIdsStr;
    }

    public String getTslPoliciesStr() {
        this.tslPoliciesStr = gson.toJson(tslPolicies);
        return tslPoliciesStr;
    }

    public void setAddCertIdsStr(String val) {
        this.addCertIdsStr = val == null ? "[]" : val;
        this.addCertIds = gson.fromJson(addCertIdsStr, listStringType);
        if (addCertIds==null){
            addCertIds = new ArrayList<String>();
        }
    }

    public void setBlockCertIdsStr(String val) {
        this.blockCertIdsStr = val == null ? "[]" : val;
        this.blockCertIds = gson.fromJson(blockCertIdsStr, listStringType);
        if (blockCertIds==null){
            blockCertIds=new ArrayList<String>();
        }
    }

    public void setTslPoliciesStr(String val) {
        this.tslPoliciesStr = val == null ? "[]" : val;
        this.tslPolicies = gson.fromJson(tslPoliciesStr, listStringType);
        if (tslPolicies==null){
            tslPolicies=new ArrayList<String>();
        }
    }

    //Default getter and setters
    public List<String> getAddCertIds() {
        return addCertIds;
    }

    public void setAddCertIds(List<String> addCertIds) {
        this.addCertIds = addCertIds;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String val) {
        this.policyName = val == null ? "" : val;
    }

    public List<String> getTslPolicies() {
        return tslPolicies;
    }

    public void setTslPolicies(List<String> tslPolicies) {
        this.tslPolicies = tslPolicies;
    }

    public List<String> getBlockCertIds() {
        return blockCertIds;
    }

    public void setBlockCertIds(List<String> blockCertIds) {
        this.blockCertIds = blockCertIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String val) {
        this.status = val == null ? "" : val;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String val) {
        this.description = val == null ? "" : val;
    }
}
