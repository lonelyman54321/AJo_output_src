/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.JobSupport;

public interface i
extends CoroutineContext$Element {
    public static final /* synthetic */ int o0;

    public ju_2 A(JobSupport var1);

    public fr0_1 G(Function1 var1);

    public Object I0(f80_0 var1);

    public Sequence b();

    public void d(CancellationException var1);

    public boolean isActive();

    public boolean n();

    public boolean p();

    public boolean start();

    public fr0_1 u(boolean var1, boolean var2, Function1 var3);

    public CancellationException w();
}

