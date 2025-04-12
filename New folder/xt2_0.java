/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from XT2
 */
public final class xt2_0
implements oU1 {
    public final ku2_0 a;
    public boolean b;

    public xt2_0(ku2_0 ku2_02, boolean bl2) {
        this.a = ku2_02;
        this.b = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object onPostFling-RZ2iAVY(long var1_1, long var3_2, f80_0 var5_3) {
        block8: {
            block7: {
                block6: {
                    block4: {
                        block5: {
                            var6_4 = var5_3 /* !! */  instanceof XT2$a;
                            if (!var6_4) ** GOTO lbl-1000
                            var7_5 = var5_3 /* !! */ ;
                            var7_5 = (XT2$a)var5_3 /* !! */ ;
                            var8_6 = var7_5.d;
                            var9_7 = -1 << -1;
                            var10_8 = var8_6 & var9_7;
                            if (var10_8 != 0) {
                                var7_5.d = var8_6 -= var9_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var7_5 = new XT2$a(this, var5_3 /* !! */ );
                            }
                            var11_9 = var7_5.b;
                            var5_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var9_7 = var7_5.d;
                            var10_8 = 1;
                            if (var9_7 == 0) break block4;
                            if (var9_7 != var10_8) break block5;
                            var3_2 = var7_5.a;
                            vl2_2.b(var11_9);
                            break block6;
                        }
                        var7_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var7_5;
                    }
                    vl2_2.b(var11_9);
                    var8_6 = (int)this.b;
                    if (var8_6 != 0) {
                        var7_5.a = var3_2;
                        var7_5.d = var10_8;
                        var11_9 = this.a.b(var3_2, (f80_0)var7_5);
                        if (var11_9 == var5_3 /* !! */ ) {
                            return var5_3 /* !! */ ;
                        } else {
                            ** GOTO lbl34
                        }
                    }
                    break block7;
                }
                var11_9 = (WA3)var11_9;
                var1_1 = var11_9.a;
                var1_1 = WA3.d(var3_2, var1_1);
                break block8;
            }
            var1_1 = 0L;
        }
        var12_10 = new WA3(var1_1);
        return var12_10;
    }

    public final long onPostScroll-DzOQY0M(long l2, long l3, int n3) {
        boolean bl2 = this.b;
        long l4 = 0L;
        if (bl2) {
            ku2_0 ku2_02 = this.a;
            dU2 dU22 = ku2_02.a;
            boolean bl3 = dU22.b();
            if (!bl3) {
                dU22 = ku2_02.a;
                float f5 = ku2_02.f(l3);
                f5 = ku2_02.c(f5);
                float f6 = dU22.e(f5);
                f6 = ku2_02.c(f6);
                l4 = ku2_02.g(f6);
            }
        }
        return l4;
    }

    public final Object onPreFling-QWom1Mo(long l2, f80_0 f80_02) {
        WA3 wA3 = new WA3(0L);
        return wA3;
    }

    public final /* synthetic */ long onPreScroll-OzD1aCk(long l2, int n3) {
        return 0L;
    }
}

