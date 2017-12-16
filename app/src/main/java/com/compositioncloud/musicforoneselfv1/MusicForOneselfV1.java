package com.compositioncloud.musicforoneselfv1;

import java.util.ArrayList;

public class MusicForOneselfV1 {

    public final String[] TITLES = {"REAL AND IMAGINED", "SMALL INTERVALS", "PALE GLISSANDI",
            "BREATHING WALLS", "BROKEN SCORE", "REARRANGED ELEVATOR", "UNRECOGNIZABLE RUSTLE",
            "CRACKING GLASSES", "CAPTURED SOUND", "GIGANTIC HEART", "LONG CREAKS",
            "DIFFERENT SIZES", "BUMP REMINDERS", "BURST OF NOISE", "HIDDEN LOUDSPEAKER",
            "CHAOTIC SEQUENCES", "DULL NOISE", "MELODIC THREADS", "JERKY CHIRPS",
            "AGITATED RUBBING", "HIGH AND FRAGILE", "SHORT SQUEAKS", "INNER SILENCE"};

    private final String CLEAR_YOUR_MIND =
            "as you go, try to clear your mind and avoid imagining any sound. ";

    private String RealAndImagined(String var1, String var2) {
        return var1 + " following the sound coming from the equipment room until you reach a " +
                "closed gate. " + var2 + "stop reading and continue only when you get there.\n\n" +
                "when you are there, try to focus on the pitches you hear in the sound, isolating them from the noisy parts and imagining that they are played " +
                "on instruments of your choice. for about a minute, alternate between the real " +
                "sound of the equipment room and your imagined instrumental version of it, as if comparing a painting to its " +
                "subject. click NEXT when you are done.";
    }

    private String SmallIntervals(String var1, String var2) {
        return var1  + " and enter the locker room (H4 Schliessfächer). " + var2 + "stop reading " +
                "and continue only when you get there.\n\nwhen you are there, focus on the sound " +
                "coming from the copy machine and imagine that two similar sounds are heard from " +
                "2 of the 107 lockers in the room. assuming that it is possible to change the " +
                "specific lockers from which the sounds come simply by looking at them (the 107 " +
                "lockers should correspond to ascending transpositions of the sound of the " +
                "copy machine, encompassing an interval slightly larger than a major second), " +
                "explore for a minute or two this odd constellation and the beating it can " +
                "produce. click NEXT when you are done.";
    }

    private String PaleGlissandi(String var1) {
        return var1 + " take the elevator or walk up the stairs to the second (top) floor. " +
                "as you go, imagine a pale tone in the middle register coming from above you, " +
                "continuously ascending or descending in pitch. whenever you hear a sound that " +
                "grabs your attention, switch the direction in which the pitch of the tone is " +
                "changing. click NEXT when you get to the second floor.";
    }

    private String BreathingWalls(String var1) {
        return var1 + "walk down the stairs to the ground floor and exit to the yard. as you go, " +
                "focus on your breathing and imagine that it is amplified and heard from the " +
                "walls of the building, as if the walls were breathing with you, starting soft " +
                "and becoming louder and louder. click NEXT when you are outside.";
    }

    private String BrokenScore() {
        return "leave the locker room through door B, and an extremely high and quiet whistle, " +
                "varying irregularly in pitch and volume, will replace the sound of the copy " +
                "machine. still, keep the sound of the copy machine in your mind and walk up the " +
                "stairs to the second floor. for each step you take, lower the pitch and " +
                "increase the loudness of the sound you imagine (as you go up, the high whistle " +
                "should become slightly louder as well). stop reading and continue only when you " +
                "get to the second floor.\n\non the second floor, you should see three chairs and " +
                "an iPhone with a broken screen, producing the high whistle you heard from " +
                "below. think of the broken screen as a graphical score (the x-axis represents " +
                "time, the y-axis pitch), and using the sound of the copy machine as the timbre " +
                "and considering the high whistle produced by the iPhone as an additional layer, " +
                "imagine a possible interpretation of this score. click NEXT when you are done " +
                "(an interpretation should last for at least one minute).";
    }

    private String RearrangedElevator(String var1) {
        return var1 + ", and take the elevator to the third (top) floor, paying attention to all " +
                "the sounds that it makes (also while you are waiting for it). after you come " +
                "out, recall the sounds in your mind but rearrange their order. imagine at " +
                "least two different orders before you click NEXT.";
    }

    private String UnrecognizableRustle(String var1) {
        return var1 + "walk to the other side of the room (behind the elevator). stop reading and " +
                "continue only when you get there.\n\nwhen you are there, take a look at the " +
                "view from one of the two skylights. \"scan\" the " +
                "picture, dividing it into rows and columns, and whenever your eyes meet a " +
                "cloud, imagine the sound of rain falling on the skylight, increasing and " +
                "decreasing in intensity according to the color of the cloud. if there are no " +
                "clouds at all, imagine just a light shower; if it is already raining, simply " +
                "listen to the real sound. as time passes, imagine that the sound quality of " +
                "your imagined rain gradually deteriorates. when it sounds (after a minute or " +
                "two) like an unrecognizable rustle, click NEXT.";
    }

    private String CrackingGlasses(String var1) {
        return var1 + "enter rooms C21-27 (the door in front of the elevator). stop reading and " +
                "continue only when you get there.\n\nwhen you are there, imagine how it would " +
                "sound if the large glass doors of the practice rooms around you " +
                "cracked apart extremely slowly and then crashed down one after another. one of these " +
                "crashes should be so loud that your ears will start ringing. hold this ringing " +
                "sound in your mind even if it is somewhat uncomfortable, and click NEXT only " +
                "after at least 10 seconds.";
    }

    private String CapturedSound() {
        return "open the window in front of you and observe how the sounds of the " +
                "outside penetrate the sounds of the inside. focus for a while on a single, specific sound " +
                "(e.g. birds, people outside, wind, etc.) and capture it in your mind. then, " +
                "close the window and imagine that the sound flies around the room trying to find a way " +
                "to escape. after about a minute, open the window again, let it out, close the " +
                "window again, and click NEXT.";
    }

    private String GiganticHeart(String var1, String var2) {
        return "on top of " + var1 + " from the previous text, imagine the beating of a gigantic heart, " +
                "sounding from " + var2 + " and pulsating at a fixed moderate rate. after about " +
                "15-25 beats, the heart should stop for a while, revive gradually, " +
                "accelerating to a rate slightly slower than before, and then after another 15-25 " +
                "beats, stop again and die. click NEXT when it is dead.";
    }

    private String LongCreaks(String var1, String var2, String var3, String var4, String var5) {
        return var1 + " a series of long slow creaks coming from " + var2 + ", some of them " +
                "sounding simultaneously, others separately. one of them should be particularly " +
                "slow, as if it is extremely stretched, continuing much longer than all the " +
                "others. during this exceptionally long creak, recall once again " + var3 + " from the previous text, " +
                "imagining that " + var4 + ". when that long creak ends, an " +
                "additional creak should follow it, also considerably long but still somewhat " +
                "shorter, slowly fading out while " + var5 + ". afterwards, click NEXT.";
    }

    private String DifferentSizes(String var1, String var2) {
        return "consider how the physical structure of the room affects the sounds around " +
                "you, and assuming that after a few seconds the size of the room drastically and " +
                "unexpectedly changes, bring back to your mind " + var1 + " from the previous text, " +
                "imagining that " + var2 + ". then, change the size of the room once again to a third, " +
                "different size, and alternate between the three different sizes for about " +
                "minute. afterwards, click NEXT.";
    }

    private String BumpReminders(String var1, String var2) {
        return var1 + " the sounds around you. whenever you hear a sound with a definite attack, " +
                "recall for a few seconds " + var2 + ". after about a minute and a half (or a " +
                "minute if even the slightest bump does not occur) imagine a long faint downward " +
                "glissando and click NEXT.";
    }

    private String BurstOfNoise(String var1) {
        return var1 + ". assume that they pass through several guitar amplifiers and raise the " +
                "distortion level of these imagined amplifiers gradually and slowly. at the same " +
                "time, repeatedly mute the amplifiers for increasing " +
                "time intervals yet at a steady rate, creating almost a pulse and ending after a " +
                "minute or two with a short burst of noise. then click NEXT.";
    }

    private String HiddenLoudspeaker(String var1, String var2, String var3) {
        return "imagine that a small loudspeaker producing " + var1 + " is hidden " + var2 +
                ". walk around and try to find where the sound comes from. however, whenever you " +
                "get close enough, imagine that the loudspeaker suddenly changes its position" +
                var3 + ". try at least twice before giving up and click NEXT.";
    }

    private String ChaoticSequences(String var1, String var2) {
        return var1 + " from time to time but somewhat " +
                "irregularly, coming in waves of increasing and decreasing density. as the " +
                "density decreases, imagine a fast, chaotic pitch sequence, whose each individual " +
                "step comes from a different " + var2 + ". each sequence should last for a few " +
                "seconds. count at least seven sequences before clicking NEXT.";
    }

    private String DullNoise(String var1) {
        return var1 + " with a soft dull noise, intermittently interrupted by a few pauses but " +
                "persistently continuing, and explore for a while this unusual imagined " +
                "situation in which nothing is audible except that dull noise. afterwards, " +
                "click NEXT.";
    }

    private String MelodicThreads(String var1, String var2) {
        return "suppose that " + var1 +". imagining that long threads are loosely hung " +
                "from the " + var2 + " from which the sounds come, follow the twisted shapes that " +
                "the threads make on the floor, as if they were contours of melodies hummed by " +
                "breathy voices, forming a polyphonic texture of growing complexity. after about " +
                "a minute, when the texture is complex enough, imagine a large crowd surrounding " +
                "you, creating a loud noisy tumult. immerse yourself in the sound and click NEXT " +
                "after about half a minute.";
    }

    private String JerkyChirps(String var1, String var2) {
        return "transform " + var1 + " from the previous text into fast jerky rhythms of chirp-like " +
                "sounds, starting and stopping seemingly and following reciprocally the changes " +
                "in the loudness of the sounds around you (if it is too homogeneous, let the " +
                "jerky chirps come in slow steady waves). " + var2 + ". click NEXT after about a " +
                "minute.";
    }

    private String AgitatedRubbing(String var1, String var2) {
        return "imagine a soft but agitated rubbing sound, whose timbre varies between a " +
                "smooth swishing and a dirty grating, produced by \"cleaning\" " + var1 + ". " +
                "click NEXT " + "when " + var2 + ".";
    }

    private String HighAndFragile() {
        return "let the pale tone from the previous text ascend to the highest " +
                "pitch you can imagine, and transform its timbre gradually so it becomes unstable " +
                "and fragile. after about a minute, abruptly cut it and click NEXT.";
    }

    private String ShortSqueaks() {
        return "let the burst of noise that ended the previous text repeat for a while. on top of that, short " +
                "squeaks are to be imagined, occurring when it is particularly quiet around you, " +
                "or otherwise, if it is never quiet or always quiet, just once in a " +
                "while. click NEXT after about 30 squeaks.";
    }

    private String InnerSilence() {
        return "finally, stop listening to any sound, both physically and mentally, and try to " +
                "imagine for about half a minute complete silence no matter how loud it is " +
                "outside. the end.";
    }

    public String CreateText(int last_text, int new_text, int context) {
        if (new_text == 22) {
            return InnerSilence();
        }
        switch (last_text) {
            case -1:
                switch (new_text) {
                    case 0:
                        return RealAndImagined("exit the main corridor through door A and walk " +
                                "down the stairs", "");
                    case 1:
                        return SmallIntervals("exit the main corridor", "");
                    case 2:
                        return PaleGlissandi("exit the main corridor through door C and");
                    default:
                        return "";
                }
            case 0:
                switch (new_text) {
                    case 9:
                        return GiganticHeart("the pitches played by the imagined instruments",
                                "behind the gate, but to your right (so that " +
                                "you are unable to see it),");
                    case 10:
                        return LongCreaks("imagine", "behind the gate", "the pitches played by the imagined instruments",
                                "their loudness is now sporadically but suddenly altered", "the imagined instruments continue playing for another few seconds");
                    case 11:
                        return DifferentSizes("the pitches played by the imagined instruments", "their loudness is now sporadically but suddenly altered");
                    default:
                        return "";
                }
            case 1:
                switch (new_text) {
                    case 14:
                        return HiddenLoudspeaker("a sound similar to the sound of the copy machine", "in one of " +
                                "the lockers", " and moves to another locker");
                    case 17:
                        return MelodicThreads("sounds similar to the sound of the copy machine are coming from 5-10 lockers " +
                                "(instead of from only two), creating a dense cluster and a complex " +
                                "beating pattern", "handles of the lockers");
                    default:
                        return "";
                }
            case 2:
                switch (new_text) {
                    case 11:
                        return DifferentSizes("the pale tone", "the tone is now clearer, " +
                                "brighter, and sometimes, although not very often, even slightly " +
                                "harsh");
                    case 20:
                        return HighAndFragile();
                    default:
                        return "";
                }
            case 3:
                switch (new_text) {
                    case 12:
                        return BumpReminders("focus on", "the amplified breathing sounds that you previously imagined");
                    case 13:
                        return BurstOfNoise("let the breathing " +
                                "sounds fade away and focus on the sounds around you");
                    case 14:
                        return HiddenLoudspeaker("the amplified breathing sounds that you previously imagined",
                                "somewhere in the yard", "");
                    default:
                        return "";
                }
            case 4:
                switch (new_text) {
                    case 0:
                        return RealAndImagined("walk down the stairs and go back to the main " +
                                "corridor (passing through the locker room again). this time, exit " +
                                "through door A, and walk down the stairs", CLEAR_YOUR_MIND);
                    case 2:
                        return PaleGlissandi("walk down the stairs and go back to the main corridor " +
                                "(passing through the locker room again). this time, exit through door C, and");
                    case 3:
                        return BreathingWalls("");
                    default:
                        return "";
                }
            case 5:
                switch (new_text) {
                    case 8:
                        return CapturedSound();
                    case 12:
                        return BumpReminders("focus on", "the sound that ended the last " +
                                "rearranged elevator sequence from the previous text");
                    case 13:
                        return BurstOfNoise("focus on the sounds around you");
                    default:
                        return "";
                }
            case 6:
                switch (new_text) {
                    case 16:
                        return DullNoise("replace the unrecognizable rustle that ended the previous text");
                    case 17:
                        return MelodicThreads("instead of a single window, there are many " +
                                "windows at different positions on the ceiling, and let the " +
                                "unrecognizable rustle that ended the previous text continue, but this time " +
                                "sounding from multiple directions", "windows");
                    case 19:
                        return AgitatedRubbing("the window physically and the unrecognizable " +
                                "rustle that ended the previous text metaphorically: the rustles should stop for " +
                                "a little while, come back, then stop for a little longer, and " +
                                "so on", "they completely disappear");
                    default:
                        return "";
                }
            case 7:
                switch (new_text) {
                    case 9:
                        return GiganticHeart("the ringing sound", "one of the rooms around you");
                    case 15:
                        return ChaoticSequences("the crashes should continue reoccurring", "room");
                    case 18:
                        return JerkyChirps("the ringing sound", "a couple of additional loud " +
                                "glass crashes are to be imagined as well, but this time, " +
                                "instead of making your ears ring, they should momentarily increase " +
                                "the loudness of the chirp-like " +
                                "sounds");
                    default:
                        return "";
                }
            case 8:
                switch (new_text) {
                    case 0:
                        return RealAndImagined("take the elevator or walk down the stairs to " +
                                "floor -1, and then continue walking down", CLEAR_YOUR_MIND);
                    case 1:
                        return SmallIntervals("take the elevator or walk down the stairs to the " +
                                "main corridor (floor -1)", CLEAR_YOUR_MIND);
                    case 2:
                        return PaleGlissandi("take the elevator or walk down the stairs to the " +
                                "main corridor (floor -1). this time, exit through door C, and then");
                    case 3:
                        return BreathingWalls("");
                    default:
                        return "";
                }
            case 9:
                switch (context) {
                    case 0:
                        switch (new_text) {
                            case 1:
                                return SmallIntervals("go back to the main corridor",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back to the main corridor. this time, exit through door C, and");
                            case 5:
                                return RearrangedElevator("walk up the stairs");
                            default:
                                return "";
                        }
                    case 7:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("get out of the practice rooms and take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1). this time, exit through door A, and then continue walking down",
                                        CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("get out of the practice rooms. take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1)", CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("get out of the practice rooms. ");
                            case 6:
                                return UnrecognizableRustle("get out of the practice rooms and ");
                            case 15:
                                return ChaoticSequences("the crash that previously made your ear ring should reoccur", "room");
                            case 18:
                                return JerkyChirps("the ringing sound", "a couple of additional " +
                                        "loud glass crashes are to be imagined as well, but this " +
                                        "time, instead of making your ears ring, they should momentarily " +
                                        "increase the loudness of " +
                                        "the chirp-like sounds");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 10:
                switch (context) {
                    case 0:
                        switch (new_text) {
                            case 1:
                                return SmallIntervals("go back to the main corridor",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back to the main corridor. this time, exit through door C, and");
                            case 5:
                                return RearrangedElevator("walk up the stairs");
                            default:
                                return "";
                        }
                    case 3:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back inside the building. enter " +
                                        "through entrance A and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back inside the building. enter through " +
                                        "entrance C and");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 11:
                switch (context) {
                    case 0:
                        switch (new_text) {
                            case 1:
                                return SmallIntervals("go back to the main corridor",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back to the main corridor. this time, exit through door C, and");
                            case 5:
                                return RearrangedElevator("walk up the stairs");
                            default:
                                return "";
                        }
                    case 2:
                        switch (new_text) {
                            case 6:
                                return UnrecognizableRustle("");
                            case 7:
                                return CrackingGlasses("");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 12:
                switch (context) {
                    case 3:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back inside the building. enter " +
                                        "through entrance A and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back inside the building. enter through " +
                                        "entrance C and");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            default:
                                return "";
                        }
                    case 5:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("take the elevator or walk down the " +
                                        "stairs to floor -1, and then continue walking down",
                                        CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("take the elevator or walk down the stairs " +
                                        "to the main corridor (floor -1),", CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("take the elevator or walk down the stairs " +
                                        "to the main corridor (floor -1). this time, exit through " +
                                        "door C, and then");
                            case 3:
                                return BreathingWalls("");
                            case 8:
                                return CapturedSound();
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 13:
                switch (context) {
                    case 3:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back inside the building. enter " +
                                        "through entrance A and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back inside the building. enter through " +
                                        "entrance C and");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            case 12:
                                return BumpReminders("focus back on",
                                        "the burst of noise that ended the previous text");
                            case 15:
                                return ChaoticSequences("let the burst of noise reoccur", "direction");
                            case 16:
                                return DullNoise("let the burst of noise that ended the previous text repeat several " +
                                    "times. then, replace it");
                            default:
                                return "";
                        }
                    case 5:
                        switch (new_text) {
                            case 8:
                                return CapturedSound();
                            case 12:
                                return BumpReminders("focus back on", "the burst of noise that " +
                                        "ended the previous text");
                            case 21:
                                return ShortSqueaks();
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 14:
                switch (context) {
                    case 1:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back to the main corridor. this time, exit " +
                                        "through door A, and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back to the main corridor. this time, exit through " +
                                        "door C, and");
                            case 4:
                                return BrokenScore();
                            default:
                                return "";
                        }
                    case 3:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back inside the building. enter " +
                                        "through entrance A and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back inside the building. enter through " +
                                        "entrance C and");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            case 10:
                                return LongCreaks("after giving up on finding the small hidden " +
                                        "loudspeaker, imagine", "beneath the ground", "those " +
                                        "breathing sounds that came from the hidden loudspeaker",
                                        "the breathing is much faster now and that someone " +
                                        "is erratically changing the volume of the loudspeaker",
                                        "the breathing gets faster and faster until it becomes " +
                                        "indistinguishable from a noisy flutter");
                            case 13:
                                return BurstOfNoise("after giving up on finding that small " +
                                        "hidden loudspeaker, focus on the sounds around you");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 15:
                switch (context) {
                    case 3:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back inside the building. enter " +
                                        "through entrance A and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back inside the building. enter through " +
                                        "entrance C and");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            default:
                                return "";
                        }
                    case 7:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("get out of the practice rooms and take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1). this time, exit through door A, and then continue walking down",
                                        CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("get out of the practice rooms. take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1)", CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("get out of the practice rooms. ");
                            case 6:
                                return UnrecognizableRustle("get out of the practice rooms and ");
                            case 18:
                                return JerkyChirps("the chaotic pitch sequences", "a couple of " +
                                        "additional loud glass crashes are to be imagined as " +
                                        "well, but this time, instead of making your ears ring, " +
                                        "they should momentarily increase the " +
                                        "loudness of the chirp-like sounds");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 16:
                switch (context) {
                    case 3:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back inside the building. enter " +
                                        "through entrance A and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back inside the building. enter through " +
                                        "entrance C and");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            default:
                                return "";
                        }
                    case 6:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1). this time, exit through door A, and then " +
                                        "continue walking down", CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1),",
                                        CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("");
                            case 7:
                                return CrackingGlasses("go back and ");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 17:
                switch (context) {
                    case 1:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back to the main corridor. this time, exit through door A, and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back to the main corridor. this time, exit " +
                                        "through door C, and");
                            case 4:
                                return BrokenScore();
                            default:
                                return "";
                        }
                    case 6:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1). this time, exit through door A, and then " +
                                        "continue walking down", CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1),",
                                        CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("");
                            case 7:
                                return CrackingGlasses("go back and ");
                            case 16:
                                return DullNoise("replace the noisy tumult that ended the previous text");
                            case 19:
                                return AgitatedRubbing("the windows physically and the noisy " +
                                        "tumult that ended the previous text metaphorically: the tumult should " +
                                        "stop for a little while, come back, then stop for a " +
                                        "little longer, and so on", "it completely disappears");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 18:
                switch (context) {
                    case 2:
                        switch (new_text) {
                            case 6:
                                return UnrecognizableRustle("");
                            case 7:
                                return CrackingGlasses("");
                            case 11:
                                return DifferentSizes("the jerky chirps", "their tone is now " +
                                        "louder, brighter, and sometimes, although not very " +
                                        "often, even slightly harsh");
                            default:
                                return "";
                        }
                    case 7:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("get out of the practice rooms and take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1). this time, exit through door A, and then continue walking down",
                                        CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("get out of the practice rooms. take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1)", CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("get out of the practice rooms. ");
                            case 6:
                                return UnrecognizableRustle("get out of the practice rooms and ");
                            case 9:
                                return GiganticHeart("the jerky chirps", "one of the rooms " +
                                        "around you");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 19:
                switch (context) {
                    case 5:
                        switch (new_text) {
                            case 0:
                                return this.RealAndImagined("take the elevator or walk down the " +
                                        "stairs to floor -1, and then continue walking down",
                                        CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("take the elevator or walk down the stairs " +
                                        "to the main corridor (floor -1),", CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("take the elevator or walk down the stairs " +
                                        "to the main corridor (floor -1). this time, exit through " +
                                        "door C, and then");
                            case 3:
                                return BreathingWalls("");
                            case 8:
                                return CapturedSound();
                            default:
                                return "";
                        }
                    case 6:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1). this time, exit through door A, and then " +
                                        "continue walking down", CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1),",
                                        CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("");
                            case 7:
                                return CrackingGlasses("go back and ");
                            default:
                                return "";
                        }
                    default:
                        return "";
                }
            case 20:
                switch (new_text) {
                    case 11:
                        return DifferentSizes("the high and fragile tone", "the tone is now " +
                                "louder, brighter, and sometimes, although not very often, even a " +
                                "bit harsh");
                    case 18:
                        return JerkyChirps("the high and fragile tone", "loud passages are to be " +
                                "accompanied by a lower tone, slightly ascending or descending " +
                                "in pitch");
                    default:
                        return "";
                }
            case 21:
                switch (new_text) {
                    case 8:
                        return CapturedSound();
                    case 19:
                        return AgitatedRubbing("the squeaks and bursts of noise from the previous texts " +
                                "metaphorically, so that they come  less and less often", "they " +
                                "completely disappear");
                    default:
                        return "";
                }
            default:
                return "";
        }
    }

    public ArrayList<Integer> whatsNext(int current_text, int context, boolean[] progress) {
        ArrayList<Integer> next_texts = new ArrayList<>();
        switch (current_text) {
            case -1:
                next_texts.add(0); next_texts.add(1); next_texts.add(2);
                break;
            case 0:
                next_texts.add(9); next_texts.add(10); next_texts.add(11);
                break;
            case 1:
                next_texts.add(14); next_texts.add(17);
                break;
            case 2:
                next_texts.add(11); next_texts.add(20);
                break;
            case 3:
                next_texts.add(12); next_texts.add(13); next_texts.add(14);
                break;
            case 4:
                next_texts.add(0); next_texts.add(2); next_texts.add(3);
                break;
            case 5:
                next_texts.add(8); next_texts.add(12); next_texts.add(13);
                break;
            case 6:
                next_texts.add(16); next_texts.add(17); next_texts.add(19);
                break;
            case 7:
                next_texts.add(9); next_texts.add(15); next_texts.add(18);
                break;
            case 8:
                next_texts.add(0); next_texts.add(1); next_texts.add(2); next_texts.add(3);
                break;
            case 9:
                if (context == 0) {
                    next_texts.add(1); next_texts.add(2); next_texts.add(5);
                }
                else if (context == 7) {
                    next_texts.add(0); next_texts.add(1); next_texts.add(3); next_texts.add(6);
                    next_texts.add(15); next_texts.add(18);
                }
                break;
            case 10:
                if (context == 0) {
                    next_texts.add(1); next_texts.add(2); next_texts.add(5);
                }
                else if (context == 3) {
                    next_texts.add(0); next_texts.add(2); next_texts.add(5);
                }
                break;
            case 11:
                if (context == 0) {
                    next_texts.add(1); next_texts.add(2); next_texts.add(5);
                }
                else if (context == 2) {
                    next_texts.add(6); next_texts.add(7);
                }
                break;
            case 12:
                if (context == 3) {
                    next_texts.add(0); next_texts.add(2); next_texts.add(5);
                }
                else if (context == 5) {
                    next_texts.add(0); next_texts.add(1); next_texts.add(2); next_texts.add(3);
                    next_texts.add(8);
                }
                break;
            case 13:
                if (context == 3) {
                    next_texts.add(0); next_texts.add(2); next_texts.add(5); next_texts.add(12);
                    next_texts.add(15); next_texts.add(16);
                }
                else if (context == 5) {
                    next_texts.add(8); next_texts.add(12); next_texts.add(21);
                }
                break;
            case 14:
                if (context == 1) {
                    next_texts.add(0); next_texts.add(2); next_texts.add(4);
                }
                else if (context == 3) {
                    next_texts.add(0); next_texts.add(2); next_texts.add(5); next_texts.add(10);
                    next_texts.add(13);
                }
                break;
            case 15:
                if (context == 3) {
                    next_texts.add(0); next_texts.add(2); next_texts.add(5);
                }
                else if (context == 7) {
                    next_texts.add(0); next_texts.add(1); next_texts.add(3); next_texts.add(6);
                    next_texts.add(18);
                }
                break;
            case 16:
                if (context == 3) {
                    next_texts.add(0); next_texts.add(2); next_texts.add(5);
                }
                else if (context == 6) {
                    next_texts.add(0); next_texts.add(1); next_texts.add(3); next_texts.add(7);
                }
                break;
            case 17:
                if (context == 1) {
                    next_texts.add(0); next_texts.add(2); next_texts.add(4);
                }
                else if (context == 6) {
                    next_texts.add(0); next_texts.add(1); next_texts.add(3); next_texts.add(7);
                    next_texts.add(16); next_texts.add(19);
                }
                break;
            case 18:
                if (context == 2) {
                    next_texts.add(6); next_texts.add(7); next_texts.add(11);
                }
                else if (context == 7) {
                    next_texts.add(0); next_texts.add(1); next_texts.add(3); next_texts.add(6);
                    next_texts.add(9);
                }
                break;
            case 19:
                if (context == 5) {
                    next_texts.add(0); next_texts.add(1); next_texts.add(2); next_texts.add(3);
                    next_texts.add(8);
                }
                else if (context == 6) {
                    next_texts.add(0); next_texts.add(1); next_texts.add(3); next_texts.add(7);
                }
                break;
            case 20:
                next_texts.add(11); next_texts.add(18);
                break;
            case 21:
                next_texts.add(8); next_texts.add(19);
                break;
        }
        for (int i=next_texts.size()-1; i>=0; i--) {
            if(progress[next_texts.get(i)]) {
                next_texts.remove(i);
            }
        }
        if (next_texts.size() > 4) {
            next_texts.remove(1);
            next_texts.remove(0);
        }
        if (next_texts.size() > 1) {
            if((!progress[0] && progress[10] && progress[11]) ||
                    (!progress[7] && progress[15] && progress[18])) {
                next_texts.remove(Integer.valueOf(9));
            }
            if(!progress[0] && progress[9] && progress[11]) {
                next_texts.remove(Integer.valueOf(10));
            }
            if(!progress[0] && progress[9] && progress[10]) {
                next_texts.remove(Integer.valueOf(11));
            }
            if((!progress[1] && progress[17]) ||
                    (!progress[3] && progress[12] && progress[13])) {
                next_texts.remove(Integer.valueOf(14));
            }
            if((!progress[1] && progress[14]) ||
                    (!progress[2] && !progress[6] && progress[12] && progress[13])) {
                next_texts.remove(Integer.valueOf(17));
            }
            if(!progress[2] && !progress[6] && progress[17] && progress[19]) {
                next_texts.remove(Integer.valueOf(16));
            }
            if(!progress[2] && !progress[6] && progress[16] && progress[17]) {
                next_texts.remove(Integer.valueOf(19));
            }
            if(!progress[2] && !progress[7] && progress[9] && progress[18]) {
                next_texts.remove(Integer.valueOf(15));
            }
            if(!progress[7] && progress[9] && progress[15]) {
                next_texts.remove(Integer.valueOf(18));
            }
            if(!progress[3] && progress[13] && progress[14]) {
                next_texts.remove(Integer.valueOf(12));
            }
            if(!progress[3] && progress[12] && progress[14]) {
                next_texts.remove(Integer.valueOf(13));
            }
        }
        return next_texts;
    }

}