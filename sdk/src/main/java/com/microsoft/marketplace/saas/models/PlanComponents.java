// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.microsoft.marketplace.saas.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PlanComponents model. */
@Fluent
public final class PlanComponents {
    /*
     * The recurrentBillingTerms property.
     */
    @JsonProperty(value = "recurrentBillingTerms")
    private List<RecurrentBillingTerm> recurrentBillingTerms;

    /*
     * The meteringDimensions property.
     */
    @JsonProperty(value = "meteringDimensions")
    private List<MeteringDimension> meteringDimensions;

    /**
     * Get the recurrentBillingTerms property: The recurrentBillingTerms property.
     *
     * @return the recurrentBillingTerms value.
     */
    public List<RecurrentBillingTerm> getRecurrentBillingTerms() {
        return this.recurrentBillingTerms;
    }

    /**
     * Set the recurrentBillingTerms property: The recurrentBillingTerms property.
     *
     * @param recurrentBillingTerms the recurrentBillingTerms value to set.
     * @return the PlanComponents object itself.
     */
    public PlanComponents setRecurrentBillingTerms(List<RecurrentBillingTerm> recurrentBillingTerms) {
        this.recurrentBillingTerms = recurrentBillingTerms;
        return this;
    }

    /**
     * Get the meteringDimensions property: The meteringDimensions property.
     *
     * @return the meteringDimensions value.
     */
    public List<MeteringDimension> getMeteringDimensions() {
        return this.meteringDimensions;
    }

    /**
     * Set the meteringDimensions property: The meteringDimensions property.
     *
     * @param meteringDimensions the meteringDimensions value to set.
     * @return the PlanComponents object itself.
     */
    public PlanComponents setMeteringDimensions(List<MeteringDimension> meteringDimensions) {
        this.meteringDimensions = meteringDimensions;
        return this;
    }
}
