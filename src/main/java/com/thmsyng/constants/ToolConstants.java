package com.thmsyng.constants;

public enum ToolConstants {
    CHNS("CHNS", "Chainsaw", "Stihl"),
    LADW("LADW", "Ladder", "Werner"),
    JAKD("JAKD", "Jackhammer", "DeWalt"),
    JAKR("JAKR", "Jackhammer", "Ridgid");

    private final String toolCode;
    private final String toolType;
    private final String toolBrand;

    ToolConstants(String toolCode, String toolType, String toolBrand){
        this.toolCode = toolCode;
        this.toolType = toolType;
        this.toolBrand = toolBrand;
    }

    public String getToolCode() {
        return toolCode;
    }

    public String getToolType() {
        return toolType;
    }

    public String getToolBrand() {
        return toolBrand;
    }
}
