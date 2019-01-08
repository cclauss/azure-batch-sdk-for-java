/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties used to create a user account on a Windows node.
 */
public class WindowsUserConfiguration {
    /**
     * The login mode for the user.
     * The default value for VirtualMachineConfiguration pools is batch and for
     * CloudServiceConfiguration pools is interactive. Possible values include:
     * 'batch', 'interactive'.
     */
    @JsonProperty(value = "loginMode")
    private LoginMode loginMode;

    /**
     * Get the default value for VirtualMachineConfiguration pools is batch and for CloudServiceConfiguration pools is interactive. Possible values include: 'batch', 'interactive'.
     *
     * @return the loginMode value
     */
    public LoginMode loginMode() {
        return this.loginMode;
    }

    /**
     * Set the default value for VirtualMachineConfiguration pools is batch and for CloudServiceConfiguration pools is interactive. Possible values include: 'batch', 'interactive'.
     *
     * @param loginMode the loginMode value to set
     * @return the WindowsUserConfiguration object itself.
     */
    public WindowsUserConfiguration withLoginMode(LoginMode loginMode) {
        this.loginMode = loginMode;
        return this;
    }

}