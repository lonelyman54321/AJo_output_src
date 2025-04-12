/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.ajiocash.datasource;

import kotlin.jvm.internal.Intrinsics;

public final class AjioWalletToBankTransferConfig {
    private String a = null;
    private String b = null;
    private String c = null;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AjioWalletToBankTransferConfig;
        if (!bl3) {
            return false;
        }
        object = (AjioWalletToBankTransferConfig)object;
        String string2 = this.a;
        String string3 = ((AjioWalletToBankTransferConfig)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.b;
        string3 = ((AjioWalletToBankTransferConfig)object).b;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.c;
        object = ((AjioWalletToBankTransferConfig)object).c;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.b;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.c;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        String string2 = this.a;
        String string3 = this.b;
        String string4 = this.c;
        return h30_0.a(og_1.a("AjioWalletToBankTransferConfig(ajioCashImpsTimeMessage=", string2, ", ajioCashImpsTransferMessage=", string3, ", ajioCashTransferStatusMessage="), string4, ")");
    }
}

