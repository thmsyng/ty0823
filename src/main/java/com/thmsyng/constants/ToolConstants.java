package com.thmsyng.constants;

public enum ToolConstants {
    CHNS("CHNS", ToolTypeConstants.CHAINSAW, "Stihl"),
    LADW("LADW", ToolTypeConstants.LADDER, "Werner"),
    JAKD("JAKD", ToolTypeConstants.JACKHAMMER, "DeWalt"),
    JAKR("JAKR", ToolTypeConstants.JACKHAMMER, "Ridgid");

    private final String toolCode;
    private final ToolTypeConstants toolType;
    private final String toolBrand;

    ToolConstants(String toolCode, ToolTypeConstants toolType, String toolBrand){
        this.toolCode = toolCode;
        this.toolType = toolType;
        this.toolBrand = toolBrand;
    }

    public String getToolCode() {
        return toolCode;
    }

    public ToolTypeConstants getToolType() {
        return toolType;
    }

    public String getToolBrand() {
        return toolBrand;
    }
}
