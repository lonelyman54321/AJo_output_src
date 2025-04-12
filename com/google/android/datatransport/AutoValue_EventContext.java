/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

import com.google.android.datatransport.AutoValue_EventContext$1;
import com.google.android.datatransport.EventContext;
import java.util.Arrays;

final class AutoValue_EventContext
extends EventContext {
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final String pseudonymousId;

    private AutoValue_EventContext(String string2, byte[] byArray, byte[] byArray2) {
        this.pseudonymousId = string2;
        this.experimentIdsClear = byArray;
        this.experimentIdsEncrypted = byArray2;
    }

    public /* synthetic */ AutoValue_EventContext(String string2, byte[] byArray, byte[] byArray2, AutoValue_EventContext$1 autoValue_EventContext$1) {
        this(string2, byArray, byArray2);
    }

    public boolean equals(Object object) {
        block6: {
            boolean bl2;
            block8: {
                block7: {
                    boolean bl3;
                    Object object2;
                    String string2;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl4 = object instanceof EventContext;
                    if (!bl4) break block6;
                    object = (EventContext)object;
                    Object object3 = this.pseudonymousId;
                    if (!(object3 == null ? (object3 = ((EventContext)object).getPseudonymousId()) == null : (bl4 = ((String)object3).equals(string2 = ((EventContext)object).getPseudonymousId())))) break block7;
                    object3 = this.experimentIdsClear;
                    boolean bl5 = object instanceof AutoValue_EventContext;
                    if (bl5) {
                        object2 = object;
                        object2 = ((AutoValue_EventContext)object).experimentIdsClear;
                    } else {
                        object2 = ((EventContext)object).getExperimentIdsClear();
                    }
                    bl4 = Arrays.equals((byte[])object3, (byte[])object2);
                    if (bl4 && (bl3 = Arrays.equals((byte[])(object3 = (Object)this.experimentIdsEncrypted), (byte[])(object = bl5 ? (Object)((AutoValue_EventContext)object).experimentIdsEncrypted : (Object)((EventContext)object).getExperimentIdsEncrypted())))) break block8;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public byte[] getExperimentIdsClear() {
        return this.experimentIdsClear;
    }

    public byte[] getExperimentIdsEncrypted() {
        return this.experimentIdsEncrypted;
    }

    public String getPseudonymousId() {
        return this.pseudonymousId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.pseudonymousId;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = Arrays.hashCode(this.experimentIdsClear);
        n3 = (n3 ^ n7) * n4;
        n4 = Arrays.hashCode(this.experimentIdsEncrypted);
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("EventContext{pseudonymousId=");
        String string2 = this.pseudonymousId;
        stringBuilder.append(string2);
        stringBuilder.append(", experimentIdsClear=");
        string2 = Arrays.toString(this.experimentIdsClear);
        stringBuilder.append(string2);
        stringBuilder.append(", experimentIdsEncrypted=");
        string2 = Arrays.toString(this.experimentIdsEncrypted);
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

