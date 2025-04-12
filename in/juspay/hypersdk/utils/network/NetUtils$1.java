/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.utils.network;

import in.juspay.hypersdk.utils.network.NetUtils;

class NetUtils$1
extends pj2_2 {
    final /* synthetic */ String val$contentType;
    final /* synthetic */ byte[] val$rawBody;

    public NetUtils$1(String string2, byte[] byArray) {
        this.val$contentType = string2;
        this.val$rawBody = byArray;
    }

    public jn1_0 contentType() {
        Object object = this.val$contentType;
        if (object != null) {
            if ((object = JN1$a.b((String)object)) != null) {
                return JN1$a.b(this.val$contentType);
            }
        }
        return NetUtils.access$000();
    }

    public void writeTo(re_2 re_22) {
        byte[] byArray = this.val$rawBody;
        re_22.write(byArray);
    }
}

