/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution;

import com.affise.attribution.AffiseComponent;
import com.affise.attribution.parameters.base.Provider;
import com.affise.attribution.parameters.providers.UserAgentProvider;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AffiseComponent$userAgentProvider$2
extends Lambda
implements Function0 {
    final /* synthetic */ AffiseComponent this$0;

    public AffiseComponent$userAgentProvider$2(AffiseComponent affiseComponent) {
        this.this$0 = affiseComponent;
        super(0);
    }

    public final UserAgentProvider invoke() {
        Object var3_3;
        Object t3;
        block3: {
            boolean bl2;
            block2: {
                Object object;
                boolean bl3;
                Iterator iterator = ((Iterable)this.this$0.getPostBackModelFactory().getAllProviders()).iterator();
                do {
                    bl2 = iterator.hasNext();
                    var3_3 = null;
                    if (!bl2) break block2;
                    object = t3 = iterator.next();
                } while (!(bl3 = (object = (Provider)t3) instanceof UserAgentProvider));
                break block3;
            }
            bl2 = false;
            t3 = null;
        }
        boolean bl4 = t3 instanceof UserAgentProvider;
        if (bl4) {
            var3_3 = t3;
        }
        return var3_3;
    }
}

