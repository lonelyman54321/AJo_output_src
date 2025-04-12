/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.Transformer;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/*
 * Renamed from zO1
 */
public final class zo1_2
implements Transformer {
    public final Object apply(Object object) {
        return ((MessagingClientEventExtension)object).toByteArray();
    }
}

