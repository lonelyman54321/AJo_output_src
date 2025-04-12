/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash.transform;

import com.ril.ajio.services.data.ajiocash.ACExtraResponse;
import com.ril.ajio.services.data.ajiocash.ACExtraResponseParam;
import com.ril.ajio.services.data.ajiocash.ACInfo;
import com.ril.ajio.services.data.ajiocash.ACMoney;
import com.ril.ajio.services.data.ajiocash.ACTopExpiring;
import com.ril.ajio.services.data.ajiocash.AjioCashNew;
import com.ril.ajio.services.data.ajiocash.GiftCard;
import com.ril.ajio.services.data.ajiocash.WalletTotal;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class AjioWalletTransform$Builder {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AjioWalletTransform transform(AjioCashNew ajioCashNew) {
        float f5;
        Object object;
        Object object2;
        boolean bl2;
        Object object3;
        String string2;
        AjioWalletTransform ajioWalletTransform;
        block44: {
            String string3;
            String string4;
            boolean bl3;
            float f6;
            block45: {
                AjioWalletTransform ajioWalletTransform2;
                AjioWalletTransform ajioWalletTransform3 = ajioWalletTransform2;
                int n3 = 16383;
                ajioWalletTransform = null;
                string2 = null;
                boolean bl4 = false;
                Object object4 = null;
                boolean bl5 = false;
                object3 = null;
                bl2 = false;
                f6 = 0.0f;
                object2 = null;
                bl3 = false;
                string4 = null;
                string3 = null;
                float f7 = 0.0f;
                object = null;
                AjioWalletTransform ajioWalletTransform4 = ajioWalletTransform2;
                ajioWalletTransform2 = null;
                ajioWalletTransform3(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, n3, null);
                if (ajioCashNew == null) {
                    return ajioWalletTransform3;
                }
                object = ajioCashNew.getTotalWalletBalance();
                f5 = 0.0f;
                ajioWalletTransform3 = null;
                if (object != null && (object = ((WalletTotal)object).getTotal()) != null) {
                    f7 = ((Float)object).floatValue();
                    ajioWalletTransform = ajioWalletTransform4;
                } else {
                    ajioWalletTransform = ajioWalletTransform4;
                    f7 = 0.0f;
                    object = null;
                }
                ajioWalletTransform.setTotalWalletBalance(f7);
                object = ajioCashNew.getTotalWalletBalance();
                if (object != null && (object = ((WalletTotal)object).getTotalCash()) != null) {
                    f7 = ((Float)object).floatValue();
                } else {
                    f7 = 0.0f;
                    object = null;
                }
                ajioWalletTransform.setTotalCash(f7);
                object = ajioCashNew.getTotalWalletBalance();
                if (object != null && (object = ((WalletTotal)object).getTotalPoints()) != null) {
                    f7 = ((Float)object).floatValue();
                } else {
                    f7 = 0.0f;
                    object = null;
                }
                ajioWalletTransform.setTotalPoints(f7);
                object = ajioCashNew.getExtraResponseParams();
                string2 = null;
                if (object != null) {
                    object = ((Iterable)object).iterator();
                    while (bl4 = object.hasNext()) {
                        object4 = (ACExtraResponse)object.next();
                        if (object4 == null || (object3 = ((ACExtraResponse)object4).getKey()) == null) continue;
                        string4 = "tnc";
                        object2 = ((ACExtraResponseParam)object3).getValue();
                        bl2 = string4.equalsIgnoreCase((String)object2);
                        if (bl2) {
                            if ((object4 = ((ACExtraResponse)object4).getValue()) != null) {
                                object4 = ((ACExtraResponseParam)object4).getValue();
                            } else {
                                bl4 = false;
                                object4 = null;
                            }
                            ajioWalletTransform.setTncURL((String)object4);
                            continue;
                        }
                        string4 = "cashDesc";
                        object2 = ((ACExtraResponseParam)object3).getValue();
                        bl2 = string4.equalsIgnoreCase((String)object2);
                        if (bl2) {
                            if ((object4 = ((ACExtraResponse)object4).getValue()) != null) {
                                object4 = ((ACExtraResponseParam)object4).getValue();
                            } else {
                                bl4 = false;
                                object4 = null;
                            }
                            ajioWalletTransform.setCashInfo((String)object4);
                            continue;
                        }
                        object2 = "pointsDesc";
                        bl5 = ((String)object2).equalsIgnoreCase((String)(object3 = ((ACExtraResponseParam)object3).getValue()));
                        if (!bl5) continue;
                        if ((object4 = ((ACExtraResponse)object4).getValue()) != null) {
                            object4 = ((ACExtraResponseParam)object4).getValue();
                        } else {
                            bl4 = false;
                            object4 = null;
                        }
                        ajioWalletTransform.setPointsInfo((String)object4);
                    }
                }
                object = ajioCashNew.getEgiftCard();
                bl4 = false;
                object4 = null;
                if (object != null) {
                    object3 = ((GiftCard)object).isGiftCardLive();
                    if (object3 != null) {
                        bl5 = (Boolean)object3;
                    } else {
                        bl5 = false;
                        object3 = null;
                    }
                    object3 = bl5;
                    ajioWalletTransform.setGiftCardLive((Boolean)object3);
                    object = ((GiftCard)object).getWalletType();
                    if (object == null) {
                        object = "AJIO Wallet";
                    }
                    ajioWalletTransform.setWalletType((String)object);
                }
                object = ajioCashNew.getMoneys();
                bl5 = true;
                if (object != null) {
                    object = ((Iterable)object).iterator();
                    while (bl2 = object.hasNext()) {
                        object2 = (ACMoney)object.next();
                        if (object2 != null) {
                            string4 = ((ACMoney)object2).getMoneyType();
                        } else {
                            bl3 = false;
                            string4 = null;
                        }
                        if (!(bl3 = b.i(string4, string3 = "AJIO_CASH_BONUS", bl5))) continue;
                        if (object2 != null) {
                            string4 = ((ACMoney)object2).getMoneyStatus();
                        } else {
                            bl3 = false;
                            string4 = null;
                        }
                        string3 = "ACTIVE";
                        bl3 = Intrinsics.areEqual(string4, string3);
                        if (bl3) {
                            if ((object2 = ((ACMoney)object2).getAmount()) != null) {
                                f6 = ((Float)object2).floatValue();
                            } else {
                                bl2 = false;
                                f6 = 0.0f;
                                object2 = null;
                            }
                            ajioWalletTransform.setActivePoints(f6);
                            continue;
                        }
                        if (object2 != null) {
                            string4 = ((ACMoney)object2).getMoneyStatus();
                        } else {
                            bl3 = false;
                            string4 = null;
                        }
                        if (!(bl3 = Intrinsics.areEqual(string4, string3 = "PENDING"))) continue;
                        if ((object2 = ((ACMoney)object2).getAmount()) != null) {
                            f6 = ((Float)object2).floatValue();
                        } else {
                            bl2 = false;
                            f6 = 0.0f;
                            object2 = null;
                        }
                        ajioWalletTransform.setPendingPoints(f6);
                    }
                }
                try {
                    object = ajioCashNew.getTotalWalletBalance();
                    if (object == null || (object = ((WalletTotal)object).getCashDetails()) == null) break block44;
                    object = (Iterable)object;
                    object = object.iterator();
                    break block45;
                }
                catch (Exception exception) {}
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
                break block44;
            }
            while (bl2 = object.hasNext()) {
                object2 = object.next();
                string4 = "AJIO_CASH_NT";
                string3 = (object2 = (ACInfo)object2) != null ? ((ACInfo)object2).getKey() : null;
                bl3 = string4.equalsIgnoreCase(string3);
                if (bl3) {
                    if (object2 != null && (object2 = ((ACInfo)object2).getValue()) != null) {
                        f6 = Float.parseFloat((String)object2);
                    } else {
                        bl2 = false;
                        f6 = 0.0f;
                        object2 = null;
                    }
                    ajioWalletTransform.setNonTransferableCash(f6);
                    continue;
                }
                string4 = "RCS_TRANSFERABLE";
                string3 = object2 != null ? ((ACInfo)object2).getKey() : null;
                bl3 = string4.equalsIgnoreCase(string3);
                if (!bl3) continue;
                if (object2 != null && (object2 = ((ACInfo)object2).getValue()) != null) {
                    f6 = Float.parseFloat((String)object2);
                } else {
                    bl2 = false;
                    f6 = 0.0f;
                    object2 = null;
                }
                ajioWalletTransform.setTransferableCash(f6);
            }
        }
        if ((object = ajioCashNew.getTopExpiringPoints()) == null) return ajioWalletTransform;
        object2 = object;
        object2 = (Collection)object;
        bl2 = object2.isEmpty();
        if (!(bl5 ^= bl2)) return ajioWalletTransform;
        object3 = (ACTopExpiring)object.get(0);
        if (object3 != null && (object3 = ((ACTopExpiring)object3).getAmount()) != null) {
            f5 = ((Float)object3).floatValue();
        }
        ajioWalletTransform.setTopExpiringPointAmount(f5);
        object = (ACTopExpiring)object.get(0);
        if (object != null) {
            string2 = ((ACTopExpiring)object).getExpiryDate();
        }
        object = k7.k(string2);
        ajioWalletTransform.setTopExpiringPointDate((String)object);
        return ajioWalletTransform;
    }
}

