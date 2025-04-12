/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.FieldDescriptor$Builder;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;

public final class E1 {
    public static Bundle a(String string2, String string3) {
        Bundle bundle = new Bundle();
        bundle.putString(string2, string3);
        return bundle;
    }

    public static FieldDescriptor b(int n3, FieldDescriptor$Builder fieldDescriptor$Builder) {
        Protobuf protobuf = AtProtobuf.builder().tag(n3).build();
        return fieldDescriptor$Builder.withProperty(protobuf).build();
    }
}

