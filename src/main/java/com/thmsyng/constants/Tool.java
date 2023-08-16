package com.thmsyng.constants;

public enum Tool {
    CHNS("CHNS", ToolType.CHAINSAW, "Stihl"),
    LADW("LADW", ToolType.LADDER, "Werner"),
    JAKD("JAKD", ToolType.JACKHAMMER, "DeWalt"),
    JAKR("JAKR", ToolType.JACKHAMMER, "Ridgid");

    private final String toolCode;
    private final ToolType toolType;
    private final String toolBrand;

    Tool(String toolCode, ToolType toolType, String toolBrand){
        this.toolCode = toolCode;
        this.toolType = toolType;
        this.toolBrand = toolBrand;
    }

    public String getToolCode() {
        return toolCode;
    }

    public ToolType getToolType() {
        return toolType;
    }

    public String getToolBrand() {
        return toolBrand;
    }
}
