/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class Bb3$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jb3_2 c;

    public Bb3$a(jb3_2 jb3_22, f80_0 f80_02) {
        this.c = jb3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        jb3_2 jb3_22 = this.c;
        Bb3$a bb3$a = new Bb3$a(jb3_22, f80_02);
        bb3$a.b = object;
        return bb3$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (Bb3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Bb3$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (fs0_2)this.b;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Bb3$a$a bb3$a$a = new Bb3$a$a(ref$BooleanRef, (fs0_2)object);
            this.a = n4;
            object = this.c.collect(bb3$a$a, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

