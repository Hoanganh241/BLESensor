/*
 * Copyright (c) Koninklijke Philips N.V. 2021.
 * All rights reserved.
 */
package com.philips.btserver.generichealthservice

enum class UnitCode(val value: Int, val symbol: String, val description : String) {
    MDCX_DIM_MILLI_MOLE_PER_M_SQ_PER_SEC(269586, "mmol m-2 s-1", "milli mole per square meter per second"),
    MDCX_DIM_X_L_PER_KG_PER_MIN(269408, "L per kg per minute", "magnitude liters per kg per minute"),
    MDC_DIM_ANG_DEG(262880, "Degree", "angle degree"),
    MDC_DIM_ANG_RAD(262912, "Rad", "angle radian"),
    MDC_DIM_BEAT(263232, "Beat", "beat"),
    MDC_DIM_BEAT_PER_MIN(264864, "bpm", "beat per minute"),
    MDC_DIM_BEAT_PER_MIN_PER_X_L(268640, "bpm l-1", "beat per minute per magnitude liter"),
    MDC_DIM_BIT(270752, "bit, b", "Bit"),
    MDC_DIM_BOOLEAN(269920, "1/0", "boolean"),
    MDC_DIM_BREATH(263264, "Breath", "breath"),
    MDC_DIM_BREATHS_PER_MIN_PER_MILLI_L(270866, "", ""),
    MDC_DIM_BYTE(270784, "byte, B", "Byte (8 bits)"),
    MDC_DIM_CELL(263296, "Cell", "cell"),
    MDC_DIM_CENTI_M(263441, "cm", ""),
    MDC_DIM_CM_H2O(266048, "cm H2O", "centimeter of water"),
    MDC_DIM_CM_H2O_PER_L(268288, "cmH2O l-1", "centimeter of water per magnitude liter"),
    MDC_DIM_CM_H2O_PER_L_PER_SEC(268064, "cmH2O l-1s-1", "centimeter of water per liter per second"),
    MDC_DIM_CM_H2O_PER_PERCENT(268128, "cmH2O %-1", "centimeter of water per percent"),
    MDC_DIM_CM_H2O_SEC_PER_BREATH(273376, "cm[H2O].s/{breath}", "centimeter of water pressure seconds per breath"),
    MDC_DIM_CM_H2O_SEC_PER_MIN(273408, "cm[H2O].s/min", "centimeter of water pressure seconds per minute"),
    MDC_DIM_COUGH(263328, "Cough", "cough"),
    MDC_DIM_CUBIC_X_L_PER_KG(265344, "m3 d-1", "cubic magnitude meter(s) per kilogram"),
    MDC_DIM_CUBIC_X_M(263712, "m3", "cubic magnitude meter(s)"),
    MDC_DIM_CUBIC_X_M_PER_CM_CUBE(263104, "m cm-3", "cubic magnitude meter(s) per cubic centimeter"),
    MDC_DIM_CUBIC_X_M_PER_DAY(265152, "m3 d-1", "cubic magnitude meter(s) per day"),
    MDC_DIM_CUBIC_X_M_PER_HR(265120, "m3 h-1", "cubic magnitude meter(s) per hour"),
    MDC_DIM_CUBIC_X_M_PER_MIN(265088, "m3 min-1", "cubic magnitude meter(s) per minute"),
    MDC_DIM_CUBIC_X_M_PER_M_CUBE(263072, "m m-3 ", "cubic magnitude meter(s) per cubic meter"),
    MDC_DIM_CUBIC_X_M_PER_SEC(265056, "m3 s-1", "cubic magnitude meter(s) per second"),
    MDC_DIM_DATE(264576, "DATE", "date - yyyy-mm-dd"),
    MDC_DIM_DAY(264416, "d", "day"),
    MDC_DIM_DECIBEL(268576, "DB", "Decibel"),
    MDC_DIM_DECIBEL_10_NANO_VOLT(270004, "dB(10nV)", "decibel (10 nanovolts)"),
    MDC_DIM_DECIBEL_DECA_NV(270080, "dB(10nV)", "decibel 10 nanovolt"),
    MDC_DIM_DECIBEL_X_MV(269984, "dB(mV)", "decibel millivolt"),
    MDC_DIM_DECIBEL_X_NV(270048, "dB(nV)", "decibel nanovolt"),
    MDC_DIM_DECIBEL_X_UV(270016, "dB(uV)", "decibel microvolt"),
    MDC_DIM_DECIBEL_X_V(269952, "dB(V)", "decibel volt"),
    MDC_DIM_DECI_BEL(270160, "dB", "Decibel"),
    MDC_DIM_DEGC(268192, "C", "degree Celsius"),
    MDC_DIM_DIMLESS(262656, "-", "dimensionless"),
    MDC_DIM_DROP(263168, "Drop", "drop"),
    MDC_DIM_DROPS_PER_MILLI_L(270834, "drops/mL", "drops per mL"),
    MDC_DIM_DROPS_PER_X_L(270816, "drops/L", "drops per L"),
    MDC_DIM_DYNE_SEC_M_SQ_PER_CM_5(270464, "dyne s m2 cm-5", "dyne seconds square meter per centimeter to the power of 5"),
    MDC_DIM_DYNE_SEC_PER_CM_5(270656, "dyne s cm-5", "dyne seconds per centimeter to the power of 5"),
    MDC_DIM_DYNE_SEC_PER_M_SQ_PER_CM_5(268160, "dyne s m-2 cm-5", "dyne seconds per square meter per centimeter to the power of 5"),
    MDC_DIM_EVOLT(266144, "eV", "magnitude electronvolt(s)"),
    MDC_DIM_FAHR(266560, "F", "degree Fahrenheit"),
    MDC_DIM_G(263872, "", ""),
    MDC_DIM_G_FORCE_M_PER_M_SQ(271072, "gf.m/m2  [trad g.m/m2] ", "magnitude gram-force meters per square meter"),
    MDC_DIM_G_M(264000, "", ""),
    MDC_DIM_G_PER_CL(264224, "g cl-3", "magnitude gram(s) per centiliter"),
    MDC_DIM_G_PER_DL(264256, "", ""),
    MDC_DIM_G_PER_L(264192, " ", " "),
    MDC_DIM_HECTO_PASCAL(265986, "hPa", ""),
    MDC_DIM_HECTO_PASCAL_SEC_PER_L(266242, " ", " "),
    MDC_DIM_HR(264384, "h", "hour"),
    MDC_DIM_INCH(263520, "", ""),
    MDC_DIM_INR(273536, " ", " "),
    MDC_DIM_INTL_UNIT(267616, "i.u.", "magnitude international unit"),
    MDC_DIM_JOULES_PER_BREATH(270592, " ", " "),
    MDC_DIM_JOULES_PER_DAY(272640, " ", " "),
    MDC_DIM_JOULES_PER_L(270624, "", ""),
    MDC_DIM_JOULES_PER_L_PER_KG(273568, " ", " "),
    MDC_DIM_JOULES_PER_L_PER_SEC(273056, "", ""),
    MDC_DIM_JOULES_PER_ML(272672, " ", " "),
    MDC_DIM_JOULES_PER_ML_PER_KG(273600, " ", " "),
    MDC_DIM_KELVIN(266528, "K", "kelvin"),
    MDC_DIM_KELVIN_PER_X_WATT(266592, "K W-1", "kelvin(s) per magnitude watt"),
    MDC_DIM_KILO_ARB_UNIT(271203, "kg-1 arb.u", "[arb.u]"),
    MDC_DIM_KILO_ARB_UNIT_PER_DAY(271459, "kg-1 arb.u d-1", " "),
    MDC_DIM_KILO_ARB_UNIT_PER_HR(271427, "kg-1 arb.u h-1", " "),
    MDC_DIM_KILO_ARB_UNIT_PER_KG(271491, "arb.u kg-1", "[arb.u]/kg"),
    MDC_DIM_KILO_ARB_UNIT_PER_KG_PER_DAY(271651, "kg-1 arb.u kg-1 d-1", " "),
    MDC_DIM_KILO_ARB_UNIT_PER_KG_PER_HR(271619, "kg-1 arb.u kg-1 h-1", " "),
    MDC_DIM_KILO_ARB_UNIT_PER_ML(271331, "kg arb.u ml-1", "[arb.u]/mL"),
    MDC_DIM_KILO_CAL(270499, "kcal", "kilo calories"),
    MDC_DIM_KILO_CAL_PER_DAY(270563, "kcal per day", "kilo calories per day"),
    MDC_DIM_KILO_G(263875, "kg", ""),
    MDC_DIM_KILO_G_FORCE_M(271011, "kgf.m  [trad kg.m] ", ""),
    MDC_DIM_KILO_G_FORCE_M_PER_L(271043, "kgf.m/L  [trad kg.m/L] ", ""),
    MDC_DIM_KILO_G_FORCE_M_PER_MIN_PER_M2(273475, "kgf.m/min/m2", "kilogram-force meters per minute per square meter"),
    MDC_DIM_KILO_G_FORCE_M_PER_M_SQ(271075, "kgf.m/m2  [trad kg.m/m2] ", ""),
    MDC_DIM_KILO_G_PER_M_SQ(269891, "kg m-2", ""),
    MDC_DIM_KILO_INTL_UNIT(267619, "kg-1 i.u.", "kg[iU]"),
    MDC_DIM_KILO_INTL_UNIT_PER_DAY(267875, "kg-1 i.u. d-1", "kg[iU]/d"),
    MDC_DIM_KILO_INTL_UNIT_PER_HR(267843, "kg-1 i.u. h-1", "kg[iU]/h"),
    MDC_DIM_KILO_INTL_UNIT_PER_KG(269827, "i.u. kg-1", "[iU]/kg"),
    MDC_DIM_KILO_INTL_UNIT_PER_KG_PER_DAY(268003, "kg-1 i.u. kg-1 d-1", "kg[iU]/kg/d"),
    MDC_DIM_KILO_INTL_UNIT_PER_KG_PER_HR(267971, "kg-1 i.u. kg-1 h-1", "kg[iU]/kg/h"),
    MDC_DIM_KILO_INTL_UNIT_PER_ML(267747, "kg ml-1", "kg[iU]/mL"),
    MDC_DIM_KILO_M_PER_SEC(264963, "km s-1", "magnitude kilometer(s) per second"),
    MDC_DIM_KILO_PASCAL(265987, "kPa", ""),
    MDC_DIM_KILO_PASCAL_PER_L(272739, "", ""),
    MDC_DIM_L(263744, "", ""),
    MDC_DIM_LB(263904, "", ""),
    MDC_DIM_L_PER_BAR(272992, " ", " "),
    MDC_DIM_L_PER_KG(265312, " ", " "),
    MDC_DIM_L_PER_MBAR(273024, "", ""),
    MDC_DIM_L_PER_MIN(265216, "l min-1", "magnitude liter(s) per minute"),
    MDC_DIM_L_PER_MIN_PER_M_SQ(264992, "", ""),
    MDC_DIM_L_PER_SEC(265184, " ", " "),
    MDC_DIM_M(263424, "m", "magnitude meter(s)"),
    MDC_DIM_MEGA_ARB_UNIT(271204, " ", "M[arbU]"),
    MDC_DIM_MEGA_ARB_UNIT_PER_DAY(271460, " ", "M[arb.u]/d"),
    MDC_DIM_MEGA_ARB_UNIT_PER_HR(271428, " ", "M[arb.u]/h"),
    MDC_DIM_MEGA_ARB_UNIT_PER_KG(271492, " ", "M[arb.u]/kg"),
    MDC_DIM_MEGA_ARB_UNIT_PER_KG_PER_DAY(271652, " ", "M[arb.u]/kg/d"),
    MDC_DIM_MEGA_ARB_UNIT_PER_KG_PER_HR(271620, " ", "M[arb.u]/kg/h"),
    MDC_DIM_MEGA_ARB_UNIT_PER_KG_PER_MIN(271588, " ", "M[arb.u]/kg/min"),
    MDC_DIM_MEGA_ARB_UNIT_PER_KG_PER_SEC(271556, " ", "M[arb.u]/kg/s"),
    MDC_DIM_MEGA_ARB_UNIT_PER_MIN(271396, " ", "M[arb.u]/min"),
    MDC_DIM_MEGA_ARB_UNIT_PER_ML(271332, " ", "M[arb.u]/mL"),
    MDC_DIM_MEGA_ARB_UNIT_PER_M_SQ(271524, " ", "M[arb.u]/m2"),
    MDC_DIM_MEGA_ARB_UNIT_PER_M_SQ_PER_DAY(271844, " ", "M[arb.u]/m2/d"),
    MDC_DIM_MEGA_ARB_UNIT_PER_M_SQ_PER_HR(271812, " ", "M[arb.u]/m2/h"),
    MDC_DIM_MEGA_ARB_UNIT_PER_M_SQ_PER_MIN(271780, " ", "M[arb.u]/m2/min"),
    MDC_DIM_MEGA_ARB_UNIT_PER_M_SQ_PER_SEC(271748, " ", "M[arb.u]/m2/s"),
    MDC_DIM_MEGA_ARB_UNIT_PER_SEC(271364, " ", "M[arb.u]/s"),
    MDC_DIM_MEGA_INTL_UNIT(267620, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_DAY(267876, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_HR(267844, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_KG(269828, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_KG_PER_DAY(268004, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_KG_PER_HR(267972, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_KG_PER_MIN(267940, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_KG_PER_SEC(267908, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_MIN(267812, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_ML(267748, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_M_SQ(269860, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_M_SQ_PER_DAY(269348, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_M_SQ_PER_HR(269092, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_M_SQ_PER_MIN(269124, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_M_SQ_PER_SEC(269796, " ", " "),
    MDC_DIM_MEGA_INTL_UNIT_PER_SEC(267780, "", ""),
    MDC_DIM_MICRO_G(263891, "ug", ""),
    MDC_DIM_MICRO_G_PER_DAY(265555, "", ""),
    MDC_DIM_MICRO_G_PER_HR(265523, "", ""),
    MDC_DIM_MICRO_G_PER_KG(262995, "ug kg-1", ""),
    MDC_DIM_MICRO_G_PER_KG_PER_DAY(265683, "", ""),
    MDC_DIM_MICRO_G_PER_KG_PER_HR(265651, "", ""),
    MDC_DIM_MICRO_G_PER_KG_PER_MIN(265619, "", ""),
    MDC_DIM_MICRO_G_PER_LB_PER_HR(268915, "", ""),
    MDC_DIM_MICRO_G_PER_LB_PER_MIN(268947, "", ""),
    MDC_DIM_MICRO_G_PER_MIN(265491, "", ""),
    MDC_DIM_MICRO_G_PER_ML(264307, "ug ml-3", ""),
    MDC_DIM_MICRO_G_PER_M_SQ(269907, "ug m-2", ""),
    MDC_DIM_MICRO_G_PER_M_SQ_PER_DAY(269331, "", ""),
    MDC_DIM_MICRO_G_PER_M_SQ_PER_HR(268979, "", ""),
    MDC_DIM_MICRO_G_PER_M_SQ_PER_MIN(269011, "", ""),
    MDC_DIM_MICRO_INTL_UNIT_PER_KG(269843, "", ""),
    MDC_DIM_MICRO_INTL_UNIT_PER_M_SQ(269875, "", ""),
    MDC_DIM_MICRO_L(263763, "ul", ""),
    MDC_DIM_MICRO_L_PER_MIN(265235, "ul min-1", ""),
    MDC_DIM_MICRO_M(263443, "um", ""),
    MDC_DIM_MICRO_SEC(264339, "us", ""),
    MDC_DIM_MICRO_VOLT(266419, "uV", ""),
    MDC_DIM_MICRO_VOLT_PER_SEC(270419, "uV/s", ""),
    MDC_DIM_MICRO_WATT(266195, "uW", ""),
    MDC_DIM_MILLI_ARB_UNIT(271218, " ", "m[arb.u]"),
    MDC_DIM_MILLI_ARB_UNIT_PER_DAY(271474, " ", "m[arb.u]/d"),
    MDC_DIM_MILLI_ARB_UNIT_PER_HR(271442, " ", "m[arb.u]/h"),
    MDC_DIM_MILLI_ARB_UNIT_PER_KG(271506, " ", "m[arb.u]/kg"),
    MDC_DIM_MILLI_ARB_UNIT_PER_KG_PER_DAY(271666, " ", "m[arb.u]/kg/d"),
    MDC_DIM_MILLI_ARB_UNIT_PER_KG_PER_HR(271634, " ", "m[arb.u]/kg/h"),
    MDC_DIM_MILLI_ARB_UNIT_PER_KG_PER_MIN(271602, " ", "m[arb.u]/kg/min"),
    MDC_DIM_MILLI_ARB_UNIT_PER_LB_PER_HR(272594, " ", "m[arb.u]/[lb_av]/h"),
    MDC_DIM_MILLI_ARB_UNIT_PER_LB_PER_MIN(271698, " ", "m[arb.u]/[lb_av]/min"),
    MDC_DIM_MILLI_ARB_UNIT_PER_MIN(271410, " ", "m[arb.u]/min"),
    MDC_DIM_MILLI_ARB_UNIT_PER_ML(271346, " ", "m[arb.u]/mL"),
    MDC_DIM_MILLI_ARB_UNIT_PER_M_SQ(271538, " ", "m[arb.u]/m2"),
    MDC_DIM_MILLI_ARB_UNIT_PER_M_SQ_PER_DAY(271858, " ", "m[arb.u]/m2/d"),
    MDC_DIM_MILLI_ARB_UNIT_PER_M_SQ_PER_HR(271826, " ", "m[arb.u]/m2/h"),
    MDC_DIM_MILLI_ARB_UNIT_PER_M_SQ_PER_MIN(271794, " ", "m[arb.u]/m2/min"),
    MDC_DIM_MILLI_ARB_UNIT_PER_M_SQ_PER_SEC(271762, " ", "m[arb.u]/m2/s"),
    MDC_DIM_MILLI_BAR(266098, "m", "millibar"),
    MDC_DIM_MILLI_BAR_SEC_PER_BREATH(273458, "mbar.s", "millibar seconds per breath"),
    MDC_DIM_MILLI_BAR_SEC_PER_L(272914, "mbar s l-1", "millibar second per liter"),
    MDC_DIM_MILLI_EQUIV(266738, "meq", ""),
    MDC_DIM_MILLI_EQUIV_PER_DAY(267346, "", ""),
    MDC_DIM_MILLI_EQUIV_PER_HR(267314, "", ""),
    MDC_DIM_MILLI_EQUIV_PER_KG(269746, "meq kg-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_KG_PER_DAY(267602, "meq kg-1 d-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_KG_PER_HR(267570, "meq kg-1 h-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_KG_PER_MIN(267538, "meq kg-1 min-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_L(266994, "meq l-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_LB_PER_HR(269170, "meq lb-1 h-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_LB_PER_MIN(269202, "meq lb-1 min-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_MIN(267282, "", ""),
    MDC_DIM_MILLI_EQUIV_PER_ML(267026, "meq ml-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_M_SQ(269778, "meq m-2", ""),
    MDC_DIM_MILLI_EQUIV_PER_M_SQ_PER_DAY(269298, "meq m-2 d-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_M_SQ_PER_HR(269234, "meq m-2 h-1", ""),
    MDC_DIM_MILLI_EQUIV_PER_M_SQ_PER_MIN(269266, "meq m-2 min-1", ""),
    MDC_DIM_MILLI_G(263890, "mg", ""),
    MDC_DIM_MILLI_G_PER_DAY(265554, "", ""),
    MDC_DIM_MILLI_G_PER_DL(264274, "mg dl-3", ""),
    MDC_DIM_MILLI_G_PER_HR(265522, "", ""),
    MDC_DIM_MILLI_G_PER_KG(262994, "mg kg-1", ""),
    MDC_DIM_MILLI_G_PER_KG_PER_DAY(265682, "", ""),
    MDC_DIM_MILLI_G_PER_KG_PER_HR(265650, "", ""),
    MDC_DIM_MILLI_G_PER_KG_PER_MIN(265618, "", ""),
    MDC_DIM_MILLI_G_PER_LB_PER_HR(268914, "", ""),
    MDC_DIM_MILLI_G_PER_LB_PER_MIN(268946, "", ""),
    MDC_DIM_MILLI_G_PER_MIN(265490, "", ""),
    MDC_DIM_MILLI_G_PER_ML(264306, "mg ml-3", ""),
    MDC_DIM_MILLI_G_PER_M_SQ(269906, "mg m-2", ""),
    MDC_DIM_MILLI_G_PER_M_SQ_PER_DAY(269330, "", ""),
    MDC_DIM_MILLI_G_PER_M_SQ_PER_HR(268978, "", ""),
    MDC_DIM_MILLI_G_PER_M_SQ_PER_MIN(269010, "", ""),
    MDC_DIM_MILLI_INTL_UNIT(267634, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_DAY(267890, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_HR(267858, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_KG(269842, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_KG_PER_DAY(268018, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_KG_PER_HR(267986, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_KG_PER_MIN(267954, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_KG_PER_SEC(267922, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_LB_PER_DAY(269042, "i.u. lb-1 d-1", "«magnitude» international units per pound per day"),
    MDC_DIM_MILLI_INTL_UNIT_PER_LB_PER_HR(272562, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_LB_PER_MIN(269074, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_MIN(267826, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_ML(267762, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_M_SQ(269874, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_M_SQ_PER_DAY(269362, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_M_SQ_PER_HR(269106, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_M_SQ_PER_MIN(269138, "", ""),
    MDC_DIM_MILLI_INTL_UNIT_PER_M_SQ_PER_SEC(269810, "", ""),
    MDC_DIM_MILLI_L(263762, "ml", " "),
    MDC_DIM_MILLI_L_PER_BEAT(268274, "ml beat-1", ""),
    MDC_DIM_MILLI_L_PER_BREATH(263794, "ml breath-1", ""),
    MDC_DIM_MILLI_L_PER_CM_H2O(268050, "ml (cmH2O)-1", ""),
    MDC_DIM_MILLI_L_PER_CM_H2O_PER_KG(270322, "ml (cmH2O)-1 kg-1", ""),
    MDC_DIM_MILLI_L_PER_DL(268562, "", ""),
    MDC_DIM_MILLI_L_PER_HPA(272978, "", ""),
    MDC_DIM_MILLI_L_PER_HR(265266, "ml h-1", ""),
    MDC_DIM_MILLI_L_PER_KG(265330, "ml kg-1", ""),
    MDC_DIM_MILLI_L_PER_KG_PER_DAY(269458, "mL per kg per day", " "),
    MDC_DIM_MILLI_L_PER_KG_PER_HR(269394, "mL per kg per hour", ""),
    MDC_DIM_MILLI_L_PER_KG_PER_MIN(269426, "mL per kg per minute", " "),
    MDC_DIM_MILLI_L_PER_MBAR(273042, "mL mbar-1", "milliliter per millibar"),
    MDC_DIM_MILLI_L_PER_MIN(265234, "ml min-1", ""),
    MDC_DIM_MILLI_L_PER_MIN_PER_KG(270930, "mL/min/kg", " "),
    MDC_DIM_MILLI_L_PER_MIN_PER_M_SQ(265010, "ml min-1 m-2", ""),
    MDC_DIM_MILLI_L_PER_M_SQ(263570, "ml/m-2", ""),
    MDC_DIM_MILLI_L_PER_M_SQ_PER_DAY(269554, " ", "magnitude volume per square meter per day"),
    MDC_DIM_MILLI_L_PER_M_SQ_PER_HR(269522, "mL per m2 per hour", ""),
    MDC_DIM_MILLI_L_PER_M_SQ_PER_MIN(269490, " ", " magnitude volume per square meter per minute"),
    MDC_DIM_MILLI_L_PER_SEC(265202, "mL/s", "milliliter(s) per second"),
    MDC_DIM_MILLI_M(263442, "mm", ""),
    MDC_DIM_MILLI_MOLE(266706, "mmol", ""),
    MDC_DIM_MILLI_MOLE_PER_DAY(267218, "mmol d-1", ""),
    MDC_DIM_MILLI_MOLE_PER_HR(267186, "mmol h-1", ""),
    MDC_DIM_MILLI_MOLE_PER_KG(267090, "mmol kg-1", ""),
    MDC_DIM_MILLI_MOLE_PER_KG_PER_DAY(267474, "mmol kg-1 d-1", ""),
    MDC_DIM_MILLI_MOLE_PER_KG_PER_HR(267442, "mmol kg-1 h-1", ""),
    MDC_DIM_MILLI_MOLE_PER_KG_PER_MIN(267410, "mmol kg-1 min-1", ""),
    MDC_DIM_MILLI_MOLE_PER_L(266866, "mmol l-1", ""),
    MDC_DIM_MILLI_MOLE_PER_MIN(267154, "mmol min-1", ""),
    MDC_DIM_MILLI_MOLE_PER_ML(266898, "mmol ml-1", ""),
    MDC_DIM_MILLI_MOLE_PER_MOLE(263026, "mmol mol-1", " "),
    MDC_DIM_MILLI_MOLE_PER_M_SQ(269714, "mmol m-2", ""),
    MDC_DIM_MILLI_MOLE_PER_M_SQ_PER_DAY(269682, "mmol m-2 d-1", ""),
    MDC_DIM_MILLI_MOLE_PER_M_SQ_PER_HR(269650, "mmol m-2 h-1", ""),
    MDC_DIM_MILLI_MOLE_PER_M_SQ_PER_MIN(269618, "mmol m-2 min-1", ""),
    MDC_DIM_MILLI_M_PER_SEC(264978, "mm s-1", ""),
    MDC_DIM_MILLI_OHM(266450, "", ""),
    MDC_DIM_MILLI_SEC(264338, "ms", ""),
    MDC_DIM_MILLI_VOLT(266418, "mV", ""),
    MDC_DIM_MILLI_WATT(266194, "mW", ""),
    MDC_DIM_MIN(264352, "min", "minute"),
    MDC_DIM_MMHG(266016, "mmHg", "millimeter(s) of mercury"),
    MDC_DIM_MMHG_MIN_PER_L(270720, "Woods Unit, WU, HRU", "mm[Hg] per (liter per minute)"),
    MDC_DIM_MMHG_SEC_PER_ML(270688, "PRU", "mm[Hg] per (mL per sec)"),
    MDC_DIM_MM_HG_PER_L(268480, "", ""),
    MDC_DIM_MM_HG_PER_PERCENT(268320, "mmHg %-1", "millimeter(s) of mercury per percent"),
    MDC_DIM_MM_HG_PER_X_L(268480, "mmHg l-1", "millimeter of mercury per magnitude liter"),
    MDC_DIM_MON(264480, "mth", "months"),
    MDC_DIM_NANO_G(263892, "ng", ""),
    MDC_DIM_NANO_G_PER_DAY(265556, "", ""),
    MDC_DIM_NANO_G_PER_HR(265524, "", ""),
    MDC_DIM_NANO_G_PER_KG(262996, "ng kg-1", ""),
    MDC_DIM_NANO_G_PER_KG_PER_DAY(265684, "", ""),
    MDC_DIM_NANO_G_PER_KG_PER_HR(265652, "", ""),
    MDC_DIM_NANO_G_PER_KG_PER_MIN(265620, "", ""),
    MDC_DIM_NANO_G_PER_LB_PER_HR(268916, "", ""),
    MDC_DIM_NANO_G_PER_LB_PER_MIN(268948, "", ""),
    MDC_DIM_NANO_G_PER_MIN(265492, "", ""),
    MDC_DIM_NANO_G_PER_ML(264308, "ng ml-3", ""),
    MDC_DIM_NANO_G_PER_M_SQ(269908, "ng m-2", ""),
    MDC_DIM_NANO_G_PER_M_SQ_PER_DAY(269332, "", ""),
    MDC_DIM_NANO_G_PER_M_SQ_PER_HR(268980, "", ""),
    MDC_DIM_NANO_G_PER_M_SQ_PER_MIN(269012, "", ""),
    MDC_DIM_NANO_INTL_UNIT_PER_KG(269844, "", ""),
    MDC_DIM_NANO_INTL_UNIT_PER_M_SQ(269876, "", ""),
    MDC_DIM_NANO_SEC(264340, "ns", ""),
    MDC_DIM_NANO_VOLT(266420, "nV", ""),
    MDC_DIM_NANO_VOLT_SEC(270388, "uV.ms", ""),
    MDC_DIM_NANO_WATT(266196, "nW", ""),
    MDC_DIM_NOS(262144, "?", "Unspecified"),
    MDC_DIM_O2_SAT_PERCENT_SEC(270944, "sat-sec", "sat % seconds"),
    MDC_DIM_OZ(263936, "", ""),
    MDC_DIM_PARTS_PER_10_TO_MINUS_12(262816, "Ppb", "10-12 (part(s) per billion )"),
    MDC_DIM_PARTS_PER_10_TO_MINUS_3(262720, "Ppht", "10-3 (part(s) per thousand )"),
    MDC_DIM_PARTS_PER_10_TO_MINUS_6(262752, "Ppm", "10-6 (part(s) per million )"),
    MDC_DIM_PARTS_PER_10_TO_MINUS_9(262784, "", "10-9 (part(s) per milliard)"),
    MDC_DIM_PA_PER_X_L(268512, "Pa l-1", "pascal per magnitude liter"),
    MDC_DIM_PCT_PCV(263392, "%PCV", "percent of packed cell volume"),
    MDC_DIM_PERCENT(262688, "%", "10-2 (percent)"),
    MDC_DIM_PER_CUBIC_X_M(263808, "m-3", "per cubic magnitude meter"),
    MDC_DIM_PER_DAY(264736, "d-1", "per day"),
    MDC_DIM_PER_HECTO_SEC_SQ(270210, "1/100s2", ""),
    MDC_DIM_PER_HR(264704, "h-1", "per hour"),
    MDC_DIM_PER_KILO_OHM(270435, "", ""),
    MDC_DIM_PER_MIN(264672, "min-1", "per minute"),
    MDC_DIM_PER_MO(264800, "mth-1", "per month"),
    MDC_DIM_PER_SQ_X_M(263680, "m-2", "per square magnitude meter"),
    MDC_DIM_PER_WK(264768, "week-1", "per week"),
    MDC_DIM_PER_X_G(263968, "g-1", "per magnitude gram"),
    MDC_DIM_PER_X_L(263840, "l-1", "per magnitude liter"),
    MDC_DIM_PER_X_L_PER_MIN(268672, " l-1 min-1", "per magnitude liter per minute"),
    MDC_DIM_PER_X_M(263584, "m-1", "per magnitude meter"),
    MDC_DIM_PER_X_OHM(270432, "W-1, S", "per magnitude ohm(s)"),
    MDC_DIM_PER_X_SEC(264608, "s-1", "per magnitude second"),
    MDC_DIM_PER_X_SEC_SQ(270208, "s-2", "per magnitude second squared"),
    MDC_DIM_PER_YR(264832, "y-1", "per year"),
    MDC_DIM_PH(263136, "PH", "pH"),
    MDC_DIM_PICO_WATT(266197, "pW", " "),
    MDC_DIM_PICO_WATT_PER_HZ(273525, "pW/Hz", " "),
    MDC_DIM_PSI(268736, "PSI", "magnitude pounds per square inch"),
    MDC_DIM_PULS_PER_MIN(264896, "puls min-1", "puls per minute"),
    MDC_DIM_RBC(263200, "Rbc", "red blood cell(s)"),
    MDC_DIM_RESP_PER_MIN(264928, "resp min-1", "respirations per minute"),
    MDC_DIM_SEC(264320, "", ""),
    MDC_DIM_SIGH(263360, "Sigh", "sigh"),
    MDC_DIM_SQUARE_BREATHS_PER_MIN_PER_L(270880, "breaths^2/min/L", "number of breaths squared per minute per L"),
    MDC_DIM_SQ_M(263616, "m2", "square magnitude meter(s)"),
    MDC_DIM_SQ_X_CM(270176, "cm2", "square magnitude cm(s)"),
    MDC_DIM_SQ_X_M(263616, "m2", "square magnitude meter(s)"),
    MDC_DIM_SQ_X_M_PER_SEC(265024, "m2 s-1", "square magnitude meter(s) per second"),
    MDC_DIM_TOD(264544, "TOD", "time of day - hh:mm:ss"),
    MDC_DIM_VOL_PERCENT(268384, "vol %", "volume percent"),
    MDC_DIM_VOL_PERCENT_PER_L(272704, "vol % per liter", "volume percent gas concentration per liter"),
    MDC_DIM_WATT(266176, "W", "magnitude watt(s)"),
    MDC_DIM_WEEKS(264448, "weeks", "weeks"),
    MDC_DIM_X_AMPS(266304, "A", "magnitude ampere(s)"),
    MDC_DIM_X_AMPS_PER_M(266368, "A m-1", "magnitude ampere(s) per meter"),
    MDC_DIM_X_AMP_HR(268224, "Ah", "magnitude ampere(s) hour"),
    MDC_DIM_X_ARB_UNIT(271200, "arb.u", "«magnitude» arbitrary unit"),
    MDC_DIM_X_ARB_UNIT_PER_CM_CUBE(271232, "arb.u cm-3", "«magnitude» arbitrary units per cubic centimeter"),
    MDC_DIM_X_ARB_UNIT_PER_DAY(271456, "arb.u d-1", "«magnitude» arbitrary units per day"),
    MDC_DIM_X_ARB_UNIT_PER_HR(271424, "arb.u h-1", "«magnitude» arbitrary units per hour"),
    MDC_DIM_X_ARB_UNIT_PER_KG(271488, "arb.u kg-1", "«magnitude» arbitrary units per kilogram"),
    MDC_DIM_X_ARB_UNIT_PER_KG_PER_DAY(271648, "arb.u kg-1 d-1", "«magnitude» arbitrary units per kilogram per day"),
    MDC_DIM_X_ARB_UNIT_PER_KG_PER_HR(271616, "arb.u kg-1 h-1", "«magnitude» arbitrary units per kilogram per hour"),
    MDC_DIM_X_ARB_UNIT_PER_KG_PER_MIN(271584, "arb.u kg-1 min-1", "«magnitude» arbitrary units per kilogram per minute"),
    MDC_DIM_X_ARB_UNIT_PER_KG_PER_SEC(271552, "arb.u kg-1 s-1", "«magnitude» arbitrary units per kilogram per second"),
    MDC_DIM_X_ARB_UNIT_PER_L(271296, "arb.u l-1", "«magnitude» arbitrary units per liter"),
    MDC_DIM_X_ARB_UNIT_PER_LB_PER_DAY(271712, "arb.u lb-1 d-1", "«magnitude» arbitrary units per pound per day"),
    MDC_DIM_X_ARB_UNIT_PER_LB_PER_HR(272576, "arb.u lb-1 h-1", "«magnitude» arbitrary units per pound per hour"),
    MDC_DIM_X_ARB_UNIT_PER_LB_PER_MIN(271680, "arb.u lb-1 min-1", "«magnitude» arbitrary units per pound per minute"),
    MDC_DIM_X_ARB_UNIT_PER_MIN(271392, "arb.u min-1", "«magnitude» arbitrary units per minute"),
    MDC_DIM_X_ARB_UNIT_PER_ML(271328, "arb.u ml-1", "«magnitude» arbitrary units per milliliter"),
    MDC_DIM_X_ARB_UNIT_PER_M_CUBE(271264, "arb.u m-3", "«magnitude» arbitrary units per cubic meter"),
    MDC_DIM_X_ARB_UNIT_PER_M_SQ(271520, "arb.u m-2", "«magnitude» arbitrary units per square meter"),
    MDC_DIM_X_ARB_UNIT_PER_M_SQ_PER_DAY(271840, "arb.u m-2 d-1", "«magnitude» arbitrary units per square meter per day"),
    MDC_DIM_X_ARB_UNIT_PER_M_SQ_PER_HR(271808, "arb.u m-2 h-1", "«magnitude» arbitrary units per square meter per hour"),
    MDC_DIM_X_ARB_UNIT_PER_M_SQ_PER_MIN(271776, "arb.u m-2 min-1", "«magnitude» arbitrary units per square meter per min"),
    MDC_DIM_X_ARB_UNIT_PER_M_SQ_PER_SEC(271744, "arb.u m-2 sec-1", "«magnitude» arbitrary units per square meter per sec"),
    MDC_DIM_X_ARB_UNIT_PER_SEC(271360, "arb.u s-1", "«magnitude» arbitrary units per second"),
    MDC_DIM_X_BAR(266080, "bar", "magnitude bar"),
    MDC_DIM_X_BEL(270144, "B", "B"),
    MDC_DIM_X_BEL_MV(270112, "B(mV)", "bel millivolt"),
    MDC_DIM_X_CAL(270496, "cal", "magnitude calories (thermal)"),
    MDC_DIM_X_CAL_PER_DAY(270560, "cal per day", "magnitude calories (thermal) per day"),
    MDC_DIM_X_CANDELA(266624, "cd", "magnitude candela(s)"),
    MDC_DIM_X_COULOMB(266336, "C", "magnitude coulomb(s)"),
    MDC_DIM_X_DROPS_PER_MIN(270272, "drops min-1", "magnitude drops(s) per minute"),
    MDC_DIM_X_DYNE(265952, "dyn", "magnitude dyne"),
    MDC_DIM_X_EQUIV(266720, "eq", "magnitude equivalent"),
    MDC_DIM_X_EQUIV_PER_CM_CUBE(266912, "eq cm-3", "magnitude equivalents per cubic centimeter"),
    MDC_DIM_X_EQUIV_PER_DAY(267328, "eq d-1", "magnitude equivalents per day"),
    MDC_DIM_X_EQUIV_PER_HR(267296, "eq h-1", "magnitude equivalents per hour"),
    MDC_DIM_X_EQUIV_PER_KG(269728, "eq kg-1", "magnitude equivalents per kilogram"),
    MDC_DIM_X_EQUIV_PER_KG_PER_DAY(267584, "eq kg-1 d-1", "magnitude equivalents per kilogram per day"),
    MDC_DIM_X_EQUIV_PER_KG_PER_HR(267552, "eq kg-1 h-1", "magnitude equivalents per kilogram per hour"),
    MDC_DIM_X_EQUIV_PER_KG_PER_MIN(267520, "eq kg-1 min-1", "magnitude equivalents per kilogram per minute"),
    MDC_DIM_X_EQUIV_PER_KG_PER_SEC(267488, "eq kg-1 s-1", "magnitude equivalents per kilogram per second"),
    MDC_DIM_X_EQUIV_PER_L(266976, "eq l-1", "magnitude equivalents per liter"),
    MDC_DIM_X_EQUIV_PER_LB_PER_HR(269152, "eq lb-1 h-1", "magnitude equivalents per pound per hour"),
    MDC_DIM_X_EQUIV_PER_LB_PER_MIN(269184, "eq lb-1 min-1", "magnitude equivalents per pound per minute"),
    MDC_DIM_X_EQUIV_PER_MIN(267264, "eq min-1", "magnitude equivalents per minute"),
    MDC_DIM_X_EQUIV_PER_ML(267008, "eq ml-1", "magnitude equivalents per milliliter"),
    MDC_DIM_X_EQUIV_PER_M_CUBE(266944, "eq m-3", "magnitude equivalents per cubic meter"),
    MDC_DIM_X_EQUIV_PER_M_SQ(269760, "eq m-2", "magnitude equivalents per square meter"),
    MDC_DIM_X_EQUIV_PER_M_SQ_PER_DAY(269280, "eq m-2 d-1", "magnitude equivalents per square meter per day"),
    MDC_DIM_X_EQUIV_PER_M_SQ_PER_HR(269216, "eq m-2 h-1", "magnitude equivalents per square meter per hour"),
    MDC_DIM_X_EQUIV_PER_M_SQ_PER_MIN(269248, "eq m-2 min-1", "magnitude equivalents per square meter per minute"),
    MDC_DIM_X_EQUIV_PER_SEC(267232, "eq s-1", "magnitude equivalents per second"),
    MDC_DIM_X_FARAD(266496, "F", "magnitude farad(s)"),
    MDC_DIM_X_G(263872, "g", "magnitude gram"),
    MDC_DIM_X_G_FORCE_M(271008, "gf.m  [trad g.m] ", "magnitude gram-force meters"),
    MDC_DIM_X_G_FORCE_M_PER_L(271040, "gf.m/L  [trad g.m/L] ", "magnitude gram-force meters per liter"),
    MDC_DIM_X_G_FORCE_M_PER_M_SQ(271072, "gf.m/m2  [trad g.m/m2] ", "magnitude gram-force meters per square meter"),
    MDC_DIM_X_G_M(264000, "g m", "magnitude gram meter"),
    MDC_DIM_X_G_M_PER_M_SQ(264032, "g m m-2", "magnitude gram(s) meter per square meter"),
    MDC_DIM_X_G_M_PER_SEC(265856, "gm s-1", "magnitude gram meter(s) per second"),
    MDC_DIM_X_G_M_SQ(264064, "g m2", "magnitude gram meter squared"),
    MDC_DIM_X_G_PER_CL(264224, "g cl-3", "magnitude gram(s) per centiliter"),
    MDC_DIM_X_G_PER_CM_CUBE(264160, "g cm-3", "magnitude gram(s) per cubic centimeter"),
    MDC_DIM_X_G_PER_DAY(265536, "g d-1", "magnitude gram(s) per day"),
    MDC_DIM_X_G_PER_DL(264256, "g dl-3", "magnitude gram(s) per deciliter"),
    MDC_DIM_X_G_PER_G(262944, "g g-1", "magnitude gram(s) per gram"),
    MDC_DIM_X_G_PER_HR(265504, "g h-1", "magnitude gram(s) per hour"),
    MDC_DIM_X_G_PER_KG(262976, "g kg-1", "magnitude gram(s) per kilogram"),
    MDC_DIM_X_G_PER_KG_PER_DAY(265664, "g kg-1 d-1", "magnitude gram(s) per kilogram per day"),
    MDC_DIM_X_G_PER_KG_PER_HR(265632, "g kg-1 h-1", "magnitude gram(s) per kilogram per hour"),
    MDC_DIM_X_G_PER_KG_PER_MIN(265600, "g kg-1 m-1", "magnitude gram(s) per kilogram per minute"),
    MDC_DIM_X_G_PER_KG_PER_SEC(265568, "g kg-1 s-1", "magnitude gram(s) per kilogram per second"),
    MDC_DIM_X_G_PER_L(264192, "g l-1", "magnitude gram(s) per liter"),
    MDC_DIM_X_G_PER_LB_PER_HR(268896, "g lb-1 h-1", "magnitude gram(s) per pound per hour"),
    MDC_DIM_X_G_PER_LB_PER_MIN(268928, "g lb-1 min-1", "magnitude gram(s) per pound per minute"),
    MDC_DIM_X_G_PER_L_PER_DAY(265792, "g l-1 d-1", "magnitude gram(s) per liter per day"),
    MDC_DIM_X_G_PER_L_PER_HR(265760, "g l-1 h-1", "magnitude gram(s) per liter per hour"),
    MDC_DIM_X_G_PER_L_PER_MIN(265728, "g l-1 m-1", "magnitude gram(s) per liter per minute"),
    MDC_DIM_X_G_PER_L_PER_SEC(265696, "g l-1 s-1", "magnitude gram (s) per liter per second"),
    MDC_DIM_X_G_PER_MG(268608, "g mg-1", "magnitude gram(s) per milligram"),
    MDC_DIM_X_G_PER_MIN(265472, "g min-1", "magnitude gram(s) per minute"),
    MDC_DIM_X_G_PER_ML(264288, "g ml-3", "magnitude gram(s) per milliliter"),
    MDC_DIM_X_G_PER_M_CUBE(264128, "g m-3 ", "magnitude gram(s) per cubic meter"),
    MDC_DIM_X_G_PER_M_PER_SEC(265824, "g m-1 s-1", "magnitude gram(s) per meter per second"),
    MDC_DIM_X_G_PER_M_SQ(269888, "g m-2", "magnitude gram(s) per square meter"),
    MDC_DIM_X_G_PER_M_SQ_PER_DAY(269312, "g m2 d-1", "magnitude gram(s) per square meter per day"),
    MDC_DIM_X_G_PER_M_SQ_PER_HR(268960, "g m2 h-1", "magnitude gram(s) per square meter per hour"),
    MDC_DIM_X_G_PER_M_SQ_PER_MIN(268992, "g m2 min-1", "magnitude gram(s) per square meter per minute"),
    MDC_DIM_X_G_PER_SEC(265440, "g s-1", "magnitude gram(s) per second"),
    MDC_DIM_X_INTL_UNIT(267616, "i.u.", "magnitude international unit"),
    MDC_DIM_X_INTL_UNIT_PER_CM_CUBE(267648, "i.u. cm-3", "magnitude international units per cubic centimeter"),
    MDC_DIM_X_INTL_UNIT_PER_DAY(267872, "i.u. d-1", "magnitude international units per day"),
    MDC_DIM_X_INTL_UNIT_PER_HR(267840, "i.u. h-1", "magnitude international units per hour"),
    MDC_DIM_X_INTL_UNIT_PER_KG(269824, "i.u. kg-1", "magnitude int. units per kilogram"),
    MDC_DIM_X_INTL_UNIT_PER_KG_PER_DAY(268000, "i.u. kg-1 d-1", "magnitude int. units per kilogram per day"),
    MDC_DIM_X_INTL_UNIT_PER_KG_PER_HR(267968, "i.u. kg-1 h-1", "magnitude int. units per kilogram per hour"),
    MDC_DIM_X_INTL_UNIT_PER_KG_PER_MIN(267936, "i.u. kg-1 min-1", "magnitude int. units per kilogram per minute"),
    MDC_DIM_X_INTL_UNIT_PER_KG_PER_SEC(267904, "i.u. kg-1 s-1", "magnitude int. units per kilogram per second"),
    MDC_DIM_X_INTL_UNIT_PER_L(267712, "i.u. l-1", "magnitude international units per liter"),
    MDC_DIM_X_INTL_UNIT_PER_LB_PER_DAY(269024, "i.u. lb-1 d-1", "«magnitude» international units per pound per day"),
    MDC_DIM_X_INTL_UNIT_PER_LB_PER_HR(272544, "i.u. lb-1 h-1", "magnitude int. units per pound per day"),
    MDC_DIM_X_INTL_UNIT_PER_LB_PER_MIN(269056, "i.u. lb-1 min-1", "magnitude int. units per pound per minute"),
    MDC_DIM_X_INTL_UNIT_PER_MIN(267808, "i.u. min-1", "magnitude international units per minute"),
    MDC_DIM_X_INTL_UNIT_PER_ML(267744, "i.u. ml-1", "magnitude international units per milliliter"),
    MDC_DIM_X_INTL_UNIT_PER_M_CUBE(267680, "i.u. m-3", "magnitude international units per cubic meter"),
    MDC_DIM_X_INTL_UNIT_PER_M_SQ(269856, "i.u. m-2", "magnitude int. units per square meter"),
    MDC_DIM_X_INTL_UNIT_PER_M_SQ_PER_DAY(269344, "i.u. m-2 d-1", "magnitude int. units per square meter per day"),
    MDC_DIM_X_INTL_UNIT_PER_M_SQ_PER_HR(269088, "i.u. m-2 h-1", "magnitude int. units per square meter per hour"),
    MDC_DIM_X_INTL_UNIT_PER_M_SQ_PER_MIN(269120, "i.u. m-2 min-1", "magnitude int. units per square meter per min"),
    MDC_DIM_X_INTL_UNIT_PER_M_SQ_PER_SEC(269792, "i.u. m-2 sec-1", "magnitude int. units per square meter per sec"),
    MDC_DIM_X_INTL_UNIT_PER_SEC(267776, "i.u. s-1", "magnitude international units per second"),
    MDC_DIM_X_JOULES(266112, "J", "magnitude joule(s)"),
    MDC_DIM_X_JOULES_PER_BREATH(270592, "J per breath", "magnitude joule(s) per breath"),
    MDC_DIM_X_JOULES_PER_L(270624, "J/L", "magnitude joule(s) per liter"),
    MDC_DIM_X_JOULES_PER_ML_PER_KG(273600, "J/mL/kg", "magnitude joule(s) per milliliter per kg"),
    MDC_DIM_X_L(263744, "l", "magnitude liter(s)"),
    MDC_DIM_X_LUMEN_PER_M_SQ(268864, "lumen/m2", "magnitude lumen(s) per square meters"),
    MDC_DIM_X_L_PER_BEAT(268256, "l beat-1", "magnitude liter(s) per beat"),
    MDC_DIM_X_L_PER_BREATH(263776, "l breath-1", "magnitude liter(s) per breath"),
    MDC_DIM_X_L_PER_CM_H2O(268032, "l (cmH2O)-1", "magnitude liter per centimeter of water"),
    MDC_DIM_X_L_PER_CM_H2O_PER_KG(270304, "l (cmH2O)-1 kg-1", "magnitude liter per centimeter of water per body weight"),
    MDC_DIM_X_L_PER_DAY(265280, "l d-1", "magnitude liter(s) per day"),
    MDC_DIM_X_L_PER_DL(268544, "l dl-1", "magnitude liter(s) per deciliter"),
    MDC_DIM_X_L_PER_HR(265248, "l h-1", "magnitude liter(s) per hour"),
    MDC_DIM_X_L_PER_KG(265312, "l kg-1", "magnitude liter(s) per kilogram"),
    MDC_DIM_X_L_PER_KG_PER_DAY(269440, "L per kg per day", "magnitude liters per kg per day"),
    MDC_DIM_X_L_PER_KG_PER_HR(269376, "L per kg per hour", "magnitude liters per kg per hour"),
    MDC_DIM_X_L_PER_L(263040, "l l-1", "magnitude liter(s) per liter"),
    MDC_DIM_X_L_PER_MIN(265216, "l min-1", "magnitude liter(s) per minute"),
    MDC_DIM_X_L_PER_MIN_PER_KG(270912, "L/min/kg", "magnitude volume per minute per body weight"),
    MDC_DIM_X_L_PER_MIN_PER_ML_HG(265408, "l min-1 mmHG-1", "magnitude liter per min. per millimeter of mercury"),
    MDC_DIM_X_L_PER_MIN_PER_M_SQ(264992, "l min-1 m-2", "magnitude liter(s) per minute per square meter"),
    MDC_DIM_X_L_PER_MM_HG(268416, "l (mmHg)-1", "magnitude liter per millimeter of mercury"),
    MDC_DIM_X_L_PER_MM_PA(268448, "l Pa-1", "magnitude liter per pascal"),
    MDC_DIM_X_L_PER_M_SQ(263552, "l/m-2", "magnitude liter(s) per square meter"),
    MDC_DIM_X_L_PER_M_SQ_PER_DAY(269536, " ", "magnitude volume per square meter per day"),
    MDC_DIM_X_L_PER_M_SQ_PER_HR(269504, "L per m2 per hour", "magnitude liters per meter squared per hour"),
    MDC_DIM_X_L_PER_M_SQ_PER_MIN(269472, "l m-2 m-1", "magnitude volume per square meter per minute"),
    MDC_DIM_X_L_PER_SEC(265184, "l s-1", "magnitude liter(s) per second"),
    MDC_DIM_X_L_SQ_PER_SEC(268096, "l2s-1", "magnitude liter squared per second"),
    MDC_DIM_X_M(263424, "m", "magnitude meter(s)"),
    MDC_DIM_X_MOLE(266688, "mol", "magnitude mole(s)"),
    MDC_DIM_X_MOLE_PER_CM_CUBE(266784, "mol cm-3", "magnitude mole(s) per cubic centimeter"),
    MDC_DIM_X_MOLE_PER_DAY(267200, "mol d-1", "magnitude mole(s) per day"),
    MDC_DIM_X_MOLE_PER_HR(267168, "mol h-1", "magnitude mole(s) per hour"),
    MDC_DIM_X_MOLE_PER_KG(267072, "mol kg-1", "magnitude mole(s) per kilogram"),
    MDC_DIM_X_MOLE_PER_KG_PER_DAY(267456, "mol kg-1 d-1", "magnitude mole(s) per kilogram per day"),
    MDC_DIM_X_MOLE_PER_KG_PER_HR(267424, "mol kg-1 h-1", "magnitude mole(s) per kilogram per hour"),
    MDC_DIM_X_MOLE_PER_KG_PER_MIN(267392, "mol kg-1 min-1", "magnitude mole(s) per kilogram per minute"),
    MDC_DIM_X_MOLE_PER_KG_PER_SEC(267360, "mol kg-1 s-1", "magnitude mole(s) per kilogram per second"),
    MDC_DIM_X_MOLE_PER_L(266848, "mol l-1", "magnitude mole(s) per liter"),
    MDC_DIM_X_MOLE_PER_MIN(267136, "mol min-1", "magnitude mole(s) per minute"),
    MDC_DIM_X_MOLE_PER_ML(266880, "mol ml-1", "magnitude mole(s) per milliliter"),
    MDC_DIM_X_MOLE_PER_MOLE(263008, "mol mol-1", "magnitude mole(s) per mole"),
    MDC_DIM_X_MOLE_PER_M_CUBE(266816, "mol m-3", "magnitude mole(s) per cubic meter"),
    MDC_DIM_X_MOLE_PER_M_SQ(269696, "mol m-2", "magnitude mole(s) per square meter"),
    MDC_DIM_X_MOLE_PER_M_SQ_PER_DAY(269664, "mol m-2 d-1", "magnitude mole(s) per square meter per day"),
    MDC_DIM_X_MOLE_PER_M_SQ_PER_HR(269632, "mol m-2 h-1", "magnitude mole(s) per square meter per hour"),
    MDC_DIM_X_MOLE_PER_M_SQ_PER_MIN(269600, "mol m-2 min-1", "magnitude mole(s) per square meter per minute"),
    MDC_DIM_X_MOLE_PER_M_SQ_PER_SEC(269568, "mol m-2 s-1", "magnitude mole(s) per square meter per second"),
    MDC_DIM_X_MOLE_PER_SEC(267104, "mol s-1", "magnitude mole(s) per second"),
    MDC_DIM_X_M_PER_MIN(268704, "m min-1 ", "magnitude meter per minute"),
    MDC_DIM_X_M_PER_PASCAL_SEC(265376, "m Pa-1s-1", "magnitude meter per pascal second"),
    MDC_DIM_X_M_PER_SEC(264960, "m s-1", "magnitude meter(s) per second"),
    MDC_DIM_X_M_PER_VOLT(270976, "mm/mV", "magnitude meters per volt"),
    MDC_DIM_X_NEWTON(265920, "N", "magnitude newton"),
    MDC_DIM_X_NEWTON_SEC(265888, "Ns", "magnitude newton second(s)"),
    MDC_DIM_X_NUTR_CAL(270528, "nutr cal ???", "magnitude nutritional calories ( = 1000 thermal cal)"),
    MDC_DIM_X_OHM(266432, "W", "magnitude ohm(s)"),
    MDC_DIM_X_OHM_M(266464, "Wm", "magnitude ohm meter(s)"),
    MDC_DIM_X_OSM(266656, "osmole", "magnitude osmole(s)"),
    MDC_DIM_X_OSM_PER_KG(267040, "osmol  kg-1", "magnitude osmoles per kilogram"),
    MDC_DIM_X_OSM_PER_L(266752, "osmol l-1", "magnitude osmoles per liter"),
    MDC_DIM_X_PASCAL(265984, "Pa", "magnitude Pascal"),
    MDC_DIM_X_PASCAL_SEC_PER_L(266240, "Pa s l-1", "magnitude pascal second per liter"),
    MDC_DIM_X_PASCAL_SEC_PER_M_CUBE(266208, "Pa s m-3", "magnitude pascal second per cubic meter"),
    MDC_DIM_X_PA_PER_PERCENT(268352, "Pa %-1", "magnitude pascal per percent"),
    MDC_DIM_X_RAD_PER_SEC(268832, "rad/s", "radians per second"),
    MDC_DIM_X_ROTATIONS_PER_MIN(270240, "rpm", "revolutions per minute"),
    MDC_DIM_X_SEC(264320, "s", "magnitude second"),
    MDC_DIM_X_TESLA(270336, "Wb m-2", "magnitude Tesla  (magnetic flux density)"),
    MDC_DIM_X_VOLT(266400, "V", "magnitude volt(s)"),
    MDC_DIM_X_VOLT_PER_SEC(270400, "V/s", "magnitude volts per second"),
    MDC_DIM_X_VOLT_SEC(270368, "V.s", "magnitude volt-seconds"),
    MDC_DIM_X_WATT(266176, "W", "magnitude watt(s)"),
    MDC_DIM_YR(264512, "y", "year"),
    UNKNOWN_CODE(0xFFFFFFF, "-", "unknown");

    companion object {
        fun fromValue(value: Int): UnitCode {
            for (type in values()) {
                if (type.value == value) return type
            }
            return UNKNOWN_CODE
        }
    }
}