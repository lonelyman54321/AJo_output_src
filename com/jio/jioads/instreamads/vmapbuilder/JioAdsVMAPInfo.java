/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapbuilder;

import com.jio.jioads.adinterfaces.JioAdsMetadata;
import java.util.List;

public final class JioAdsVMAPInfo {
    public String a;
    public String b;
    public String c;
    public JioAdsMetadata d;
    public List e;

    public final List getCuePoints() {
        return this.e;
    }

    public final JioAdsMetadata getMetadata() {
        return this.d;
    }

    public final String getMidRollAdspot() {
        return this.b;
    }

    public final String getPostRollAdspot() {
        return this.c;
    }

    public final String getPreRollAdspot() {
        return this.a;
    }

    public final void setCuePoints(List list) {
        this.e = list;
    }

    public final void setMetadata(JioAdsMetadata jioAdsMetadata) {
        this.d = jioAdsMetadata;
    }

    public final void setMidRollAdspot(String string2) {
        this.b = string2;
    }

    public final void setPostRollAdspot(String string2) {
        this.c = string2;
    }

    public final void setPreRollAdspot(String string2) {
        this.a = string2;
    }
}

