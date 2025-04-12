/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

public class Attachment$UnsupportedAttachmentException
extends Exception {
    public Attachment$UnsupportedAttachmentException(String string2) {
        string2 = cP.a("Attachment ", string2, " not supported");
        super(string2);
    }
}

