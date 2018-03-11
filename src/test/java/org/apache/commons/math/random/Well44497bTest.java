/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math.random;

import org.junit.Assert;
import org.junit.Test;

public class Well44497bTest extends RandomGeneratorAbstractTest {
    
    @Override
    public RandomGenerator makeGenerator() {
        return new Well44497b(100);
    }
        
    @Test
    public void testReferenceCode() {
        int[] base = {
              740849862,  1202665156,  -199039369,  -259008301,  -291878969, -1164428990, -1565918811,   491009864,
            -1883086670,  1383450241,  1244617256,   689006653, -1576746370, -1307940314,  1421489086,  1742094000,
             -595495729,  1047766204,  1875773301, -1637793284,  1379017098,   262792705,   191880010,  -251000180,
            -1753047622,  -972355720,    90626881,  1644693418,  1503365577,   439653419,  1806361562,  1268823869
         };
        int[] init = new int[1391];
        for (int i = 0; i < init.length; ++i) {
            init[i] = base[i % base.length] + i;
        }
        Well44497b mt = new Well44497b(init);
        int[] refInt = {
           -102003638,  -1254584449,    836441550,   1949705484,    653000494,   1579400718,    699652570,   -140738233,   1164288466,    419933874,    366568847,    780567309,   1867405910,   -350557801,   -964350642,  -1323492759,
            191502468,    398676344,   1568976991,   1005053759,    199053603,     31083944,     74697788,  -1343941248,  -1205631880,  -1637961625,    361813531,  -1706096179,   -403340909,   1666226814,  -2034962600,   1237102662,
          -1833248535,   1584255126,   1295661745,  -1753848945,   1208145993,    930278953,   -733716134,    192752767,   1692463060,   1727273316,   2122952931,   -809025255,   -992081044,   -895539688,   -419372543,  -1835478922,
           2089629419,   1646590742,  -1261083717,  -1005462992,   1619627287,  -1437723182,   1619689210,   1319393089,  -1816963183,   -150214444,   -513482220,   1897815796,  -1861960936,  -1766444468,   2034653890,    585657634,
           1867016559,    696942260,  -1536237241,   -527055447,  -1554805020,  -1063992566,   1024799415,   1782080572,  -1884276362,    129028272,   1427925968,  -1154222271,  -1383146732,  -1580532830,  -1907049616,   -104299169,
          -1780913000,  -2090815339,  -1789809502,  -1521443849,   1226625769,   1126090676,  -2117094290,   -449575109,   -218982833,   -695554478,     35923022,   1386126825,    -95031305,   -168657023,    436674049,  -1137917876,
          -2045134053,  -1025629865,    133144659,     64226081,  -1966942130,    700813483,    344058910,   -910646033,   -212789479,    740360859,  -1269028713,   1517763679,   -664178514,   -683718472,    -71951996,     86583727,
          -1235669348,  -1426987265,   -166598353,    214190040,  -1436967644,    233824411,    710927452,  -1939548641,   -433607408,  -1075939594,  -1549702826,  -1310827917,   -640604762,   -696863672,  -1282162126,   -546470833,
          -1516734192,   -513809904,   -458526835,    708926727,   -476643096,  -2108375037,     -2870478,  -1460116421,    436587555,   -948939610,   1891375124,   1944216545,    959034236,  -1267038790,  -1695098736,   1853748495,
           1594424552,   1270099319,   1139585482,   1837434635,   -709909535,   -457524230,   -887118113,   -241703912,  -1888225819,   -751575804,   1122280146,   1194255209,    949350188,    892826516,   -791212042,   -151203035,
           -859297731,  -1979039938,    323603119,  -1022065097,  -1804294506,   -385802891,  -2127523442,   -720380255,  -1315859127,    999649487,    335041941,  -1732821688,  -1833409827,    535715225,  -1285355653,   1206723386,
          -1141619270,    759796285,  -1599504546,  -1988521411,   1056668895,   -852564594,   1056509609,  -1831687977,    754168875,  -1301144422,    922880446,  -1502666503,   -949791898,  -1043870198,  -1136941938,  -1649670259,
           1342769348,   1692605059,   -132279148,  -1108038310,    -14355545,  -1611387086,   1651826569,    877600127,   1356160799,   -759125205,  -1300490081,   -414938486,   -201479285,   1958709363,   1513313540,  -1396836908,
           1352702612,   1142506253,     52969438,   -365142357,  -1619054179,  -1368514102,   1470750417,  -1420830959,   -843909462,  -1679570143,   1447444607,    234551752,  -1507452115,  -1433234579,   -680890000,   -497305145,
            860408898,    263376761,   1537070218,   -592353956,   1587852989,   1756653749,  -2081320633,  -1547020311,    723771611,   -883819383,   1899879513,   -268417584,   1058606451,   1665941493,  -1630340612,   -614737477,
            891313237,   1368950660,  -1166187089,    296322368,  -1908770726,  -2120378408,   1245479677,   1879710487,  -1705947124,   1018371589,  -1715010575,  -1096078094,  -1749891454,   2130888667,    318647750,    554592231,
           -489121568,  -1809605233,  -1697905160,   -953926536,  -2013960553,   -148884919,   1822739964,  -1466301760,    141999978,   1946526064,   1323036718,    864390149,  -2141665227,   1510602225,   1468408474,   1277039721,
          -1368096647,    180965986,   2140852057,   -688071899,    819713016,   -154385940,  -1182972611,   1257224305,   1392607672,   1364245931,  -1768434401,    323522132,   -555278604,    474186520,  -1178901665,  -2137343658,
           1636421121,   1398987084,   1276656225,   1013316006,   -955917865,  -1537149363,   -179145358,    342862050,   1172728007,    736300054,  -1114656959,  -1831840325,  -1882353535,   -442915191,  -1206488416,  -1818534411,
             25312311,   2100297098,  -1562767719,   1762553519,  -1853194231,  -1152612739,  -2020055792,   -809572150,    848584579,   -535789699,   1817604709,   1343773216,   -602234204,   1739930964,   -833790834,    501215449,
           -730104057,   1217783189,   -681773267,   -611951354,    978387629,  -1516811237,    974303980,  -1389665696,   2091099075,   -727528826,   2116026151,    271935854,    613242379,  -2100429856,    190004963,  -1629612570,
          -1362888327,    175094223,   -917873219,  -2008308245,   -401946815,    504218792,  -1966525201,      4106248,    164895454,    226502921,    655865257,   -610528718,    189428750,   1055978898,     17603028,    591024369,
           1127922501,  -1546639293,   1994174637,   -724136988,   -673919372,  -1665002120,   -612145705,   -793102882,  -1904763558,    757565058,  -2091240021,  -2123324826,  -1518702766,   -802889839,   -223045921,  -1509216579,
           1195556261,   2079259971,   -903969953,  -1781800655,   1834950463,   -956531922,  -1152550807,  -1116052662,   -348802884,  -1395330117,    -91758501,    -19115285,   1926930669,  -1015793599,    545904386,   1617858191,
            716963473,   1917089719,   -980914811,   -212646927,  -1634695647,  -1857924568,  -1462257477,   1273750178,   1060328454,   -361604424,    867932749,    451213698,    405780152,   1165233215,   1877230909,   2103114395,
           1644330815,   1252998537,   1961603970,  -1533101488,   1790456024,    -38226118,  -1306744489,    713676418,  -1535871838,   1378109935,   -338185548,   1647669762,   -477465913,    203482277,  -1949756706,   -503326093,
           -638704909,    320186309,  -1435581459,    907446649,    -77384645,    537368928,   -335347295,  -1912061924,    547819174,   -225549827,   1089455486,    463516297,   -240127764,    -85895271,   2053179697,   -287394931,
            921878827,   -933362608,  -1178670275,  -1200942874,   -672571265,    574422382,   1441734039,  -1814493454,    165751640,   -176907245,  -1170992192,  -2123252090,  -1435971541,   1591853830,   -885477992,   -792847559,
           1359875286,   1038392904,  -2027255124,    687291425,   -165513490,   1391146576,  -1387080955,    794663652,   -807189965,    667820962,   -545384499,  -1371368854,   -689031878,   1504805541,   -752825823,  -1920047745,
          -1884874017,   -350566320,   -197152911,   -181743050,   -798415949,   -915922276,   1790690149,   -363997181,   1923116185,  -1326427198,  -1621079427,  -1997440997,   1798118127,  -2053110382,   -159879848,  -1286787216,
           1046436411,   1832030471,   -389092059,     71686169,    -76025260,   1914270607,   1854169353,    872157826,  -1774323792,   -575165717,  -1919931724,   2051498109,  -1176174934,   -883578901,  -1253047270,  -1310573900,
            245466682,  -1784824328,  -1319912821,   1377340217,   1364313761,   -408687373,    142333378,  -1952335763,  -1703126184,    316314678,   2030555423,    488640834,  -1783293306,   2116925005,   -428337460,    -42966447,
           -476226114,   -325172903,  -1690748475,    852791569,     26490302,     85251337,  -1374975770,   -376283969,    982639600,    595119792,    376403422,   1574509912,  -1509664496,  -1901241749,    -59019104,    358566667,
            341667214,    184541206,   -550950854,  -1897143732,   1595753537,  -1236127928,   2014297822,  -2033179270,   -669806121,  -1927596980,   1010735700,   -581795164,   1922398838,  -1456743538,  -1633813803,    323177707,
           2002098813,  -2099067658,    277393729,   -671911622,   -384463053,   2028267908,    367391785,   1270052637,   -172839030,   -650486693,   -831800809,  -1255138113,   -137512799,   1904317942,     -8229811,    707361898,
           -276859812,     50417442,   1487081728,   1577776181,   1994451303,   1237303035,   -602016235,  -1905218276,  -1895725672,   1172978849,    801129953,  -1819485071,   -587985848,  -2010386741,  -1645226427,   -850866837,
            816998708,    357665811,   1955856762,   1617902189,  -1013761306,    146782652,    904185608,   -500146809,   2085848310,   1917713975,  -1823786899,   1994184748,    789196322,   1766857258,   1770685286,     58213029,
          -1699628994,    346827379,  -1274423227,     -5079670,   -193099487,   1020296939,  -1795904054,  -1951053094,    -43782418,   -375403393,   1026761026,   -207269610,   1364563521,   1578793454,    457809423,   -534138380,
          -1052938788,  -1897101526,   1449976516,   2052800058,  -1145169719,   1476303269,    370625650,   -325249282,      2165984,   1631432802,   1032336355,  -1292978191,  -1810172401,    725725820,  -1162678778,    702624490,
           1387673527,    981825943,   -556408212,  -1108487850,  -1782136935,   1582316425,  -1752682164,    307235003,   1386486299,  -1343636074,   1936875586,  -1265279891,   -345847069,    928241171,    239050350,   1859358526,
           -664776217,   -823267892,    346651710,   -867656288,  -1907921425,   1362445801,    541145461,   -192727350,   1649366606,    244694627,   -488180018,    214008256,   2032125437,  -1678591993,   -264593820,   1309017286,
           -652451998,   1845366657,   -703990120,   -550186406,   -630285276,   1782372955,   1650564210,  -1127904234,  -1407983860,  -1119422877,  -1565976361,  -1913545385,    549841420,  -1410323732,  -1964467146,    228296551,
           -421026422,   1929094398,   -266906424,    264810315,  -2008122665,  -1088278148,    141242192,   1871293282,    234634067,   1724159838,   1638271051,   -837713428,   -657941661,    168093988,    708605363,  -1881612509,
          -1810496006,   -193495322,   1889982309,  -2050702012,   -693694192,  -1249780322,    718733403,    -76349730,   -188217051,    920912090,  -1814078273,   2013358456,  -1948845521,   -198407575,  -1248904632,   1182772565,
           1236791612,  -1297489171,  -1958468586,   1437011007,    390460941,    113068796,   1247982993,   2102889679,  -1563524844,   -128174212,   -754095070,  -1461699362,    943615640,  -1013270737,    221253920,   1514140013,
           1596946745,    674222984,    616356702,   1811224435,  -1764322023,  -1653707581,  -1702404459,    390678142,   -209506765,  -1398278531,   -117061517,   1625861343,    659048069,  -1490678943,    846536668,    210715637,
           1855458786,   1727745280,   1086729456,   1109111683,   -985298098,  -1813777567,   -954599702,  -1522494031,   1166103515,   -191868965,  -1048777852,   -661271058,   1161457421,   1509090409,   -919753558,   -155431193,
          -1774302994,   -366390263,   2090138916,   -693431491,  -1693888428,   1846774454,    925855693,    474383470,    208889079,    382195164,   -283005634,  -2095134392,    579927985,   1390765326,  -1766119865,    900457129,
          -1503703236,    974952690,   -107714111,    381338452,   1187256613,   -860560742,    524103620,   1499506130,    197755276,   -790802926,   -406920967,  -1972219791,   -665721155,   -113336203,   1037154436,  -1185441801,
           -745541706,   -546274471,   1988928457,  -1975403782,  -1167172845,    777779004,  -1560935061,   -140258712,  -1243598232,  -1394149587,   -785002782,    311842991,  -1025469277,   -605350463,  -1251538057,    537203966,
            597777961,  -1845767072,  -1556349193,  -1491015509,  -1935936671,   2093498487,   1908270236,   -315396187,   1356362300,  -2025658518,    630119678,    276190559,    510123398,  -1266145363,   -170152124,   -151540077,
           -477900187,   1895894303,   1870333068,  -1169891437,    353366620,   2111175941,   1691245786,   1318765802,    -90993610,    921309517,    118241505,    367005284,   1624861072,   2010785894,    865255951,   1717799691,
            -80757664,   -644944841,    136999836,   -341686875,  -1908076090,  -1968934200,   -346397811,   -184213520,   -511811333,  -2118173466,  -1086490399,   1795322855,   -635494328,    415716276,    851044432,   -904636831,
          -1972230341,    -64337858,    571177016,   1248814747,  -1351030778,    457872680,   1843549954,   1718960038,    815088665,   1812961065,    360686952,  -1356586646,   1657802416,   1776192945,   -786723490,   -342254407,
           -236653811,    771014701,    906386785,   -308057635,   1907957462,    206000440,    -42143480,    900403654,   -917549795,   -310520796,  -1713627766,   2061136240,   -377977839,    891282946,   -821163030,    328143584,
           1503793080,    551621842,  -2086273683,  -2070526343,     91195293,  -1654389038,  -1035734266,   -336619597,  -1220221027,  -1468468844,   2105626873,   -841372573,   -122707018,  -2013073683,    494461000,  -2054807734,
            -67946259,   1914163407,   1941835405,  -1027244745,   -768123277,    419129844,   -275750260,   -171533009,     97756174,    -17651409,  -1578102255,    995291430,  -1587462977,    692904675,    951632643,   1882101293,
          -1546298756,   2018418068,  -1790777661,   1542305514,  -1437624383,    469587009,  -1647853474,  -1318279028,    497228822,    726733469,   1693133452,  -2091185798,   -209017732,    126386499,   1056958932,  -2105494133,
            754067324,     96463951,     83701151,   1101658289,   1485852701,    553783806,   1898769881,  -1072031442,   1438062141,   1992540265,   1152252136,   1019391719,   -175951257,     -6691216,    989789689,    968359367,
          -1330392786,   1704963399,   -998432914,   -948060232,  -1921688855,   -975840920,   1360273515,   -872810459,     12676907,  -1908050756,    883609616,     65641549,   -200365398,   1386653304,  -1203665071,   1878689007,
            426262328,    315375145,   1900325181,    703658494,   -765404895,   1070155172,   1399748900,   -804264234,  -1619419026,   1347225486,    230635292,   1093717835,     14020583,  -2107039873,   -968325341,  -1679158691,
           1959784097,   1065690797,   1090615161,   1311445364,    865835426,    870016646,    574122879,   1842697922,  -1289210431,  -1914001560,   1672467629,   -900366331,  -1524066872,    136503816,  -1910431892,  -1431958329,
           -830367152,  -1316233970,   -801974860,   1560669382,    -81784810,    401822577,   -949103202,    943897151,   -722666726,    -96825841,  -1092898846,    230567004,    -70355840,  -1398069192,   -312953142,   1475420133,
           -622491023,   1661205388,    -19071322,      6024591,   1473041593,   2053897978,  -1346768903,   1484764721,  -1552461890,   1287146711,   1613069307,    902497864,  -1504480063,    375292915,   -836353108,   2047602411
        };

        for (int i = 0; i < refInt.length; ++i) {
            Assert.assertEquals(refInt[i], mt.nextInt());
        }

    }

}
