/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import java.util.Map;

public interface AddressApi {
    public Object checkPostalCode(String var1, String var2, String var3, f80_0 var4);

    public Object createAddress(String var1, String var2, String var3, Map var4, f80_0 var5);

    public Object deleteAddress(String var1, String var2, String var3, f80_0 var4);

    public Object getAddress(String var1, String var2, String var3, f80_0 var4);

    public Object getDropAtStoreList(String var1, String var2, String var3, f80_0 var4);

    public Object getExchangeReturnAddresses(String var1, String var2, String var3, f80_0 var4);

    public Object setDefaultAddress(String var1, String var2, String var3, Map var4, f80_0 var5);

    public Object updateAddress(String var1, String var2, String var3, Map var4, f80_0 var5);

    public Object updateAddressPD(String var1, String var2, String var3, Map var4, f80_0 var5);
}

