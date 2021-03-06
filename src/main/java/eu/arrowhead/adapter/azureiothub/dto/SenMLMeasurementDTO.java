package eu.arrowhead.adapter.azureiothub.dto;

import java.io.Serializable;

public class SenMLMeasurementDTO implements Serializable {

    //=================================================================================================
    // members

    private String n; // name
    private String sv; // string value - measured value in String format

    //=================================================================================================
    // methods

    //-------------------------------------------------------------------------------------------------

    public SenMLMeasurementDTO(final String n, final String sv) {
        this.n = n;
        this.sv = sv;
    }

    //-------------------------------------------------------------------------------------------------

    public String getN() { return n; }
    public String getSv() { return sv; }

    //-------------------------------------------------------------------------------------------------

    public void setN(final String n) { this.n = n; }
    public void setSv(final String sv) { this.sv = sv; }

    //-------------------------------------------------------------------------------------------------
}
