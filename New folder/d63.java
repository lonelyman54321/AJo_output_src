/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d63
extends Lambda
implements Function0 {
    public final /* synthetic */ X53 c;

    public d63(X53 x53) {
        this.c = x53;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        String string2 = "There are multiple DataStores active for the same file: ";
        Serializable serializable = (File)this.c.a.invoke();
        CharSequence charSequence = serializable.getAbsolutePath();
        Object object = X53.l;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    LinkedHashSet linkedHashSet;
                    try {
                        linkedHashSet = X53.k;
                        boolean bl2 = linkedHashSet.contains(charSequence) ^ true;
                        if (!bl2) break block4;
                        string2 = "it";
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    Intrinsics.checkNotNullExpressionValue(charSequence, string2);
                    linkedHashSet.add(charSequence);
                    return serializable;
                }
                charSequence = new StringBuilder(string2);
                ((StringBuilder)charSequence).append(serializable);
                string2 = ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).";
                ((StringBuilder)charSequence).append(string2);
                string2 = ((StringBuilder)charSequence).toString();
                string2 = string2.toString();
                serializable = new IllegalStateException(string2);
                throw serializable;
            }
            throw throwable2;
        }
    }
}

