/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class LB0
extends k0_0 {
    public final Metadata Q(do1_2 object, ByteBuffer object2) {
        byte[] byArray = ((ByteBuffer)object2).array();
        int n3 = ((Buffer)object2).limit();
        Metadata$Entry[] metadata$EntryArray = new Xm2(byArray, n3);
        String string2 = metadata$EntryArray.r();
        string2.getClass();
        String string3 = metadata$EntryArray.r();
        string3.getClass();
        long l2 = metadata$EntryArray.q();
        long l3 = metadata$EntryArray.q();
        object2 = metadata$EntryArray.a;
        int n4 = metadata$EntryArray.b;
        int n7 = metadata$EntryArray.c;
        byte[] byArray2 = Arrays.copyOfRange((byte[])object2, n4, n7);
        object2 = new EventMessage(string2, string3, l2, l3, byArray2);
        metadata$EntryArray = new Metadata$Entry[]{object2};
        object = new Metadata(metadata$EntryArray);
        return object;
    }
}

