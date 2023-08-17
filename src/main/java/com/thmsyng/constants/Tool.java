package com.thmsyng.constants;

public enum Tool {
    CHNS(ToolType.CHAINSAW, "Stihl"),
    LADW(ToolType.LADDER, "Werner"),
    JAKD(ToolType.JACKHAMMER, "DeWalt"),
    JAKR(ToolType.JACKHAMMER, "Ridgid");

    private final ToolType toolType;
    private final String toolBrand;

    Tool(ToolType toolType, String toolBrand){
        this.toolType = toolType;
        this.toolBrand = toolBrand;
    }

    public ToolType getToolType() {
        return toolType;
    }

    public String getToolBrand() {
        return toolBrand;
    }
}
