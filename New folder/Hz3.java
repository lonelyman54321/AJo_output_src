/*
 * Decompiled with CFR 0.152.
 */
import coil.request.NullRequestDataException;
import kotlin.jvm.functions.Function1;

public final class Hz3
implements Function1 {
    public final /* synthetic */ im2 a;
    public final /* synthetic */ im2 b;
    public final /* synthetic */ im2 c;

    public /* synthetic */ Hz3(im2 im22, im2 im23, im2 im24) {
        this.a = im22;
        this.b = im23;
        this.c = im24;
    }

    public final Object invoke(Object object) {
        boolean bl2 = (object = (pq$a_0)object) instanceof pq$a$c;
        if (bl2) {
            im2 im22 = this.a;
            object = (pq$a$c)object;
            if (im22 != null) {
                object.getClass();
                object = new pq$a$c(im22);
            }
        } else {
            bl2 = object instanceof pq$a$b;
            if (bl2) {
                object = (pq$a$b)object;
                hb0_0 hb0_02 = ((pq$a$b)object).b;
                Object object2 = hb0_02.c;
                boolean bl3 = object2 instanceof NullRequestDataException;
                if (bl3) {
                    object2 = this.b;
                    if (object2 != null) {
                        object = new pq$a$b((im2)object2, hb0_02);
                    }
                } else {
                    object2 = this.c;
                    if (object2 != null) {
                        object = new pq$a$b((im2)object2, hb0_02);
                    }
                }
            }
        }
        return object;
    }
}

