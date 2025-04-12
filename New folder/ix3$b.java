/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ix3$b
extends Lambda
implements Function0 {
    public final /* synthetic */ ix3 c;

    public ix3$b(ix3 ix32) {
        this.c = ix32;
        super(0);
    }

    public final Object invoke() {
        SSLSocketFactory sSLSocketFactory;
        block6: {
            sSLSocketFactory = null;
            b.c();
            Object object = this.c;
            object = ((ix3)object).d;
            object = ((hh3_2)object).getValue();
            object = (SSLContext)object;
            if (object == null) break block6;
            try {
                sSLSocketFactory = ((SSLContext)object).getSocketFactory();
            }
            catch (Exception exception) {
                object = a$a.INFO;
                ((a$a)((Object)object)).intValue();
            }
        }
        return sSLSocketFactory;
    }
}

