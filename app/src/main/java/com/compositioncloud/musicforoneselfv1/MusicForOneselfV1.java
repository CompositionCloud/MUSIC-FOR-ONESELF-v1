package com.compositioncloud.musicforoneselfv1;

import java.util.ArrayList;

public class MusicForOneselfV1 {

    public String[] TITLES = {"REAL AND IMAGINED", "SMALL INTERVALS", "PALE GLISSANDI",
            "BREATHING WALLS", "BROKEN SCORE", "REARRANGED ELEVATOR", "UNRECOGNIZABLE RUSTLE",
            "CRACKING GLASSES", "CAPTURED SOUND", "GIGANTIC HEART", "LONG CREAKS",
            "DIFFERENT SIZES", "BUMP REMINDERS", "BURST OF NOISE", "HIDDEN LOUDSPEAKER",
            "CHAOTIC SEQUENCES", "DULL NOISE", "MELODIC THREADS", "JERKY CHIRPS",
            "AGITATED RUBBING", "HIGH AND FRAGILE", "SHORT SQUEAKS", "INNER SILENCE"};

    String CLEAR_YOUR_MIND =
            "as you go, try to clear your mind and avoid imagining any sound. ";

    String RealAndImagined(String var1, String var2) {
        return var1 + " following the sound coming from the equipment room, until you reach a " +
                "closed gate. " + var2 + "stop reading and continue only when you get there.\n\n" +
                "when you are there, try to focus on the pitch components of that sound and " +
                "\"clean\" them in your mind from the noisy ones, imagining that they are played " +
                "on instruments of your choice. for about a minute, alternate between the real " +
                "sound and its imagined instrumental version, as if comparing a painting to its " +
                "subject. click NEXT when you are done.";
    }

    String SmallIntervals(String var1, String var2) {
        return var1  + " and enter the locker room (H4 Schliessfächer). " + var2 + "stop reading " +
                "and continue only when you get there.\n\nwhen you are there, focus on the sound " +
                "coming from the copy machine and imagine that two similar sounds are heard from " +
                "two of the 107 lockers in the room. assuming that it is possible to change the " +
                "specific lockers from which the sounds come simply by looking at them (the 107 " +
                "lockers should correspond to an ascending transpositions of the sound of the " +
                "copy machine, encompassing an interval slightly larger than a major 2nd), " +
                "explore for a minute or two this odd constellation and the beating it can " +
                "produce. click NEXT when you are done.";
    }

    String PaleGlissandi(String var1) {
        return var1 + " and take the elevator or walk up the stairs to the second (top) floor. " +
                "as you go, imagine a pale tone in the middle register coming from above you, " +
                "continuously ascending or descending in pitch. whenever you hear something that " +
                "grabs your attention, switch the direction in which the pitch of the tone is " +
                "changing. click NEXT when you get to the second floor.";
    }

    String BreathingWalls(String var1) {
        return var1 + "walk down the stairs to the ground floor and exit to the yard. as you go, " +
                "focus on your breathing and imagine that it is amplified and heard from the " +
                "walls of the building, as if the walls were breathing with you, starting soft " +
                "and becoming louder and louder. click NEXT when you are outside.";
    }

    String BrokenScore() {
        return "leave the locker room and enter door B, and an extremely high and quiet whistle, " +
                "varying irregularly in pitch and volume, will replace the sound of the copy " +
                "machine. still, keep the sound of the copy machine in your mind and walk up the " +
                "stairs to the second floor. for each step you take, lower the pitch and " +
                "increase the loudness of the sound you imagine (as you go up, the high whistle " +
                "should become a bit louder as well). stop reading and continue only when you " +
                "get to the second floor.\n\non the second floor you should see three chairs and " +
                "an iPhone whose screen is broken, producing the high whistle you heard from " +
                "below. think of the broken screen as a graphical score (the x-axis represents " +
                "time, the y-axis pitch), and using the sound of the copy machine as the timbre " +
                "and considering the high whistle produced by the iPhone as an additional layer, " +
                "imagine a possible interpretation of this score. click NEXT when you are done " +
                "(an interpretation should last at least one minute).";
    }

    String RearrangedElevator(String var1) {
        return var1 + " and take the elevator to the third (top) floor, paying attention to all " +
                "the sounds that it makes (also while you are waiting for it). after you come " +
                "out, recall those sounds in your mind but rearrange their order. imagine at " +
                "least two different orders before you click NEXT.";
    }

    String UnrecognizableRustle(String var1) {
        return var1 + "walk to the other side of the room behind the elevator. stop reading and " +
                "continue only when you get there.\n\nwhen you are there, take a look at the " +
                "view from one of the two windows above you showing the sky. \"scan\" the " +
                "picture, dividing it into rows and columns, and whenever your eyes meet a " +
                "cloud, imagine the sound of rain falling on the window, increasing and " +
                "decreasing in intensity according to the color of the cloud. if there are no " +
                "clouds at all, imagine just a light shower; if it is already raining, simply " +
                "listen to the real sound. as time passes, imagine that the sound quality of " +
                "your imagined rain gradually deteriorates. when it sounds (after a minute or " +
                "two) like an unrecognizable rustle, click NEXT.";
    }

    String CrackingGlasses(String var1) {
        return var1 + "enter rooms C21-27 (the door in front of the elevator). stop reading and " +
                "continue only when you get there.\n\nwhen you are there, imagine the sound of " +
                "the large glass doors of the practice rooms around you cracking apart extremely " +
                "slowly for about half a minute and then crashing one after the other. one of " +
                "these crashes should be so loud that your ears will start ringing. hold this " +
                "ringing sound in your mind even if it is somewhat uncomfortable, and click NEXT " +
                "only after at least 10 seconds.";
    }

    String CapturedSound() {
        return "afterwards, open the window in front of you and observe how the sound of the " +
                "outside penetrates the sound of the inside. focus for a while on a single part " +
                "of the sound (birds, people outside, wind, etc.), capture it in your mind and " +
                "close the window, imagining that it flies around the room, trying to find a way " +
                "to escape. after about a minute, open the window again, let it out, close the " +
                "window again and click NEXT.";
    }

    String GiganticHeart(String var1, String var2) {
        return "on top of " + var1 + " from before, imagine the beating of a gigantic heart, " +
                "sounding from " + var2 + " and pulsating at a fixed moderate rate. after about " +
                "15-25 beatings the heart should stop for a while, revive gradually, " +
                "accelerating to a rate a bit slower than before, and then after another 15-25 " +
                "beatings, stop again and die. click NEXT when it is dead.";
    }

    String LongCreaks(String var1, String var2, String var3, String var4, String var5) {
        return var1 + " a series of long slow creaks coming from " + var2 + ", some of them " +
                "sounding simultaneously, others separately. one of them should be particularly " +
                "slow, as if it is extremely stretched, continuing much longer than all the " +
                "others. during that exceptionally long creak, recall once again " + var3 + " " +
                "from before, imagining that " + var4 + ". when that long creak ends, an " +
                "additional creak should follow it, also considerably long, but still somewhat " +
                "shorter, slowly fading out while " + var5 + ". afterwards, click NEXT.";
    }

    String DifferentSizes(String var1, String var2) {
        return "consider then how the physical structure of the room affects the sound around " +
                "you, and assuming that after a few seconds the size of the room drastically and " +
                "unexpectedly changes, bring back to your mind " + var1 + " from before. " +
                "imagining that " + var2 + ", change the size of the room once again to a third, " +
                "different size, and alternate between these three different sizes for about " +
                "minute. afterwards, click NEXT.";
    }

    String BumpReminders(String var1, String var2) {
        return var1 + " the sound around you. whenever you hear a sound with a definite attack, " +
                "recall for a few seconds " + var2 + ". after about a minute and a half (or a " +
                "minute if even the slightest bump does not occur) imagine a long faint downward " +
                "glissando and click NEXT.";
    }

    String BurstOfNoise(String var1) {
        return var1 + ". assume that it passes through several guitar amplifiers and raise the " +
                "distortion level of these imagined amplifiers gradually and slowly. at the same " +
                "time, repeatedly mute the sound of the amplifiers in your mind for increasing " +
                "time intervals yet at a steady rate, creating almost a pulse and ending after a " +
                "minute or two with a short burst of noise. then click NEXT.";
    }

    String HiddenLoudspeaker(String var1, String var2, String var3) {
        return "imagine then that a small loudspeaker, producing " + var1 + ", is hidden " + var2 +
                ". walk around and try to find where the sound comes from, however, whenever you " +
                "get close enough, imagine that the loudspeaker suddenly changes its position" +
                var3 + ". try at least twice before giving up and click NEXT.";
    }

    String ChaoticSequences(String var1, String var2) {
        return "afterwards, let " + var1 + " from before reoccur from time to time but somewhat " +
                "irregularly, coming in waves of increasing and decreasing density. as the " +
                "density decreases, imagine a fast chaotic pitch sequence, whose each individual " +
                "step comes from a different " + var2 + ". every sequence should last for a few " +
                "seconds. count at least seven sequences before clicking NEXT.";
    }

    String DullNoise(String var1) {
        return var1 + " with a soft dull noise, intermittently interrupted by a few pauses but " +
                "persistently continuing, and explore for a while this unusual imagined " +
                "situation in which nothing is audible except that dull noise. afterwards, " +
                "click NEXT.";
    }

    String MelodicThreads(String var1, String var2) {
        return "suppose now that " + var1 +". imagining that long threads are loosely hung " +
                "from the " + var2 + " from which the sounds come, follow the twisted shape that " +
                "the threads make on the floor, as if they were contours of melodies hummed by " +
                "breathy voices, forming a polyphonic texture of growing complexity. after about " +
                "a minute, when the texture is complex enough, imagine a large crowd surrounding " +
                "you, creating a loud noisy tumult. immerse yourself in the sound and click NEXT " +
                "after about half a minute.";
    }

    String JerkyChirps(String var1, String var2) {
        return "then, transform " + var1 + " from before into fast jerky rhythms of chirp-like " +
                "sounds, starting and stopping seemingly and following reciprocally the changes " +
                "in the loudness of the sound around you (if it is too homogeneous, let the " +
                "jerky chirps come in slow steady waves). " + var2 + ". click NEXT after about a " +
                "minute.";
    }

    String AgitatedRubbing(String var1, String var2) {
        return "imagine then a soft but agitated rubbing sound, whose timbre varies between a " +
                "smooth swishing and a dirty grating, produced by \"cleaning\" " + var1 + ". " +
                "click NEXT " + "when " + var2 + ".";
    }

    String HighAndFragile() {
        return "keeping that pale tone from before in your mind, let it ascend to the highest " +
                "pitch you can imagine and gradually transform its timbre so it becomes unstable " +
                "and fragile. after about a minute abruptly cut it and click NEXT.";
    }

    String ShortSqueaks() {
        return "let the burst of noise from before repeat for a while. on top of that, short " +
                "squeaks are to be imagined, occurring when the sound around you is particularly " +
                "quiet, or otherwise, if the loudness is too homogeneous, just once in a while. " +
                "click NEXT after about 30 squeaks.";
    }

    String InnerSilence() {
        return "finally, stop listening to any sound, both physically and mentally, and try to " +
                "imagine for about half a minute a complete silence no matter how loud it is " +
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
                        return PaleGlissandi("exit the main corridor through door C");
                    default:
                        return "";
                }
            case 0:
                switch (new_text) {
                    case 9:
                        return GiganticHeart("that instrumental version of the sound of the " +
                                "equipment room", "behind the gate, but to your right (so that " +
                                "you are unable to see it),");
                    case 10:
                        return LongCreaks("imagine then", "behind the gate", "that instrumental " +
                                "version of the sound of the equipment room", "it is played with " +
                                "sporadic but sudden changes in dynamics", "the instrumental " +
                                "sound remains for another few seconds");
                    case 11:
                        return DifferentSizes("that instrumental version of the sound of the " +
                                "equipment room", "it is played with sporadic but sudden " +
                                "alterations in dynamics");
                    default:
                        return "";
                }
            case 1:
                switch (new_text) {
                    case 14:
                        return HiddenLoudspeaker("that sound of the copy machine", "in one of " +
                                "the lockers", " and moves to another locker");
                    case 17:
                        return MelodicThreads("there are sounds coming from 5-10 lockers " +
                                "(instead of only two), creating a dense cluster and a complex " +
                                "beating pattern", "handles of the lockers");
                    default:
                        return "";
                }
            case 2:
                switch (new_text) {
                    case 11:
                        return DifferentSizes("the pale tone", "the tone become clearer, " +
                                "brighter and sometimes, although not very often, even a bit " +
                                "harsh");
                    case 20:
                        return HighAndFragile();
                    default:
                        return "";
                }
            case 3:
                switch (new_text) {
                    case 12:
                        return BumpReminders("focus then on", "those breathing " +
                                "sounds from before");
                    case 13:
                        return BurstOfNoise("while you are standing outside, let the breathing " +
                                "sounds fade away and focus on the sound around you");
                    case 14:
                        return HiddenLoudspeaker("those breathing sounds from before",
                                "somewhere in the yard", "");
                    default:
                        return "";
                }
            case 4:
                switch (new_text) {
                    case 0:
                        return RealAndImagined("walk down the stairs, go back to the main " +
                                "corridor (passing through the locker room), exit this time " +
                                "through door A and walk down the staircase", CLEAR_YOUR_MIND);
                    case 2:
                        return PaleGlissandi("walk down the stairs, go back to the main corridor " +
                                "(passing through the locker room), exit this time through door C");
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
                        return BumpReminders("focus then on", "the sound that ended the last " +
                                "rearranged elevator sequence from before");
                    case 13:
                        return BurstOfNoise("focus then on the sound around you");
                    default:
                        return "";
                }
            case 6:
                switch (new_text) {
                    case 16:
                        return DullNoise("replace then the unrecognizable rustle from before");
                    case 17:
                        return MelodicThreads("instead of a single window, there are many " +
                                "windows at different positions on the ceiling, and let that " +
                                "unrecognizable rustle from before continue, but this time " +
                                "sounding from multiple directions", "windows");
                    case 19:
                        return AgitatedRubbing("the window physically and the unrecognizable " +
                                "rustle from before metaphorically: the rustles should stop for " +
                                "a little while, come back, then stop for a little longer, and " +
                                "so on", "they completely disappear");
                    default:
                        return "";
                }
            case 7:
                switch (new_text) {
                    case 9:
                        return GiganticHeart("that ringing sound", "one of the rooms around you");
                    case 15:
                        return ChaoticSequences("the crashes", "room");
                    case 18:
                        return JerkyChirps("that ringing sound", "a couple of additional loud " +
                                "glass crashes are to be imagined as well, but this time, " +
                                "instead of making your ears ring, they should increase " +
                                "momentarily but substantially the loudness of the chirp-like " +
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
                                "main corridor (floor -1),", CLEAR_YOUR_MIND);
                    case 2:
                        return PaleGlissandi("take the elevator or walk down the stairs to the " +
                                "main corridor (floor -1), exit this time through door C");
                    case 3:
                        return BreathingWalls("take the elevator or ");
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
                                return PaleGlissandi("go back to the main corridor, exit this " +
                                        "time through door C");
                            case 5:
                                return RearrangedElevator("walk up the stairs");
                            default:
                                return "";
                        }
                    case 7:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("get out of the practice rooms, take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1), and then continue walking down",
                                        CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("get out of the practice rooms, take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1)", CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("get out of the practice rooms, take the " +
                                        "elevator or ");
                            case 6:
                                return UnrecognizableRustle("get out of the practice rooms and ");
                            case 15:
                                return ChaoticSequences("the crashes", "room");
                            case 18:
                                return JerkyChirps("that ringing sound", "a couple of additional " +
                                        "loud glass crashes are to be imagined as well, but this " +
                                        "time, instead of making your ears ring, they should " +
                                        "increase momentarily but substantially the loudness of " +
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
                                return PaleGlissandi("go back to the main corridor, exit this " +
                                        "time through door C");
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
                                        "entrance C");
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
                                return PaleGlissandi("go back to the main corridor, exit this " +
                                        "time through door C");
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
                                        "entrance C");
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
                                        "to the main corridor (floor -1), exit this time through " +
                                        "door C");
                            case 3:
                                return BreathingWalls("take the elevator or ");
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
                                        "entrance C");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            case 12:
                                return BumpReminders("shift your focus of attention back to",
                                        "the burst of noise that ended the previous text");
                            case 15:
                                return ChaoticSequences("the burst of noise", "direction");
                            case 16:
                                return DullNoise("let the burst of noise from before repeat for " +
                                    "a while and then replace it");
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
                                return RealAndImagined("go back to the main corridor, exit this " +
                                        "time through door A and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back inside the building. enter through " +
                                        "entrance C ");
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
                                        "entrance C");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            case 10:
                                return LongCreaks("after giving up on finding that small hidden " +
                                        "loudspeaker, imagine", "beneath the ground", "those " +
                                        "breathing sounds that came from the hidden loudspeaker",
                                        "the breathing is much faster now and someone " +
                                        "erratically changes the volume of the loudspeaker",
                                        "the breathing gets faster and faster until it becomes " +
                                        "indistinguishable from a noisy flutter");
                            case 13:
                                return BurstOfNoise("after giving up on finding that small " +
                                        "hidden loudspeaker, focus on the sound around you");
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
                                        "entrance C");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            default:
                                return "";
                        }
                    case 7:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("get out of the practice rooms, take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1), and then continue walking down",
                                        CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("get out of the practice rooms, take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1)", CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("get out of the practice rooms, take the " +
                                        "elevator or ");
                            case 6:
                                return UnrecognizableRustle("get out of the practice rooms and ");
                            case 18:
                                return JerkyChirps("those chaotic pitch sequences", "a couple of " +
                                        "additional loud glass crashes are to be imagined as " +
                                        "well, but this time, instead of making your ears ring, " +
                                        "they should increase momentarily but substantially the " +
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
                                        "entrance C");
                            case 5:
                                return RearrangedElevator("go back inside the building. enter " +
                                        "through entrance A");
                            default:
                                return "";
                        }
                    case 6:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back, take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1), and then " +
                                        "continue walking down", CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("go back, take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1),",
                                        CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("go back, take the elevator or ");
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
                                return RealAndImagined("go back to the main corridor, exit this " +
                                        "time through door A and walk down the stairs",
                                        CLEAR_YOUR_MIND);
                            case 2:
                                return PaleGlissandi("go back inside the building. enter " +
                                        "through entrance C ");
                            case 4:
                                return BrokenScore();
                            default:
                                return "";
                        }
                    case 6:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back, take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1), and then " +
                                        "continue walking down", CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("go back, take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1),",
                                        CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("go back, take the elevator or ");
                            case 7:
                                return CrackingGlasses("go back and ");
                            case 16:
                                return DullNoise("replace then the noisy tumult from before");
                            case 19:
                                return AgitatedRubbing("the windows physically and the noisy " +
                                        "tumult from before metaphorically: the tumult should " +
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
                                return DifferentSizes("the jerky chirps", "their tone becomes " +
                                        "louder, brighter and sometimes, although not very " +
                                        "often, even a bit harsh");
                            default:
                                return "";
                        }
                    case 7:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("get out of the practice rooms, take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1), and then continue walking down",
                                        CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("get out of the practice rooms, take the " +
                                        "elevator or walk down the stairs to the main corridor " +
                                        "(floor -1)", CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("get out of the practice rooms, take the " +
                                        "elevator or ");
                            case 6:
                                return UnrecognizableRustle("get out of the practice rooms and ");
                            case 9:
                                return GiganticHeart("those jerky chirps", "one of the rooms " +
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
                                        "to the main corridor (floor -1), exit this time through " +
                                        "door C");
                            case 3:
                                return BreathingWalls("take the elevator or ");
                            case 8:
                                return CapturedSound();
                            default:
                                return "";
                        }
                    case 6:
                        switch (new_text) {
                            case 0:
                                return RealAndImagined("go back, take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1), and then " +
                                        "continue walking down", CLEAR_YOUR_MIND);
                            case 1:
                                return SmallIntervals("go back, take the elevator or walk down " +
                                        "the stairs to the main corridor (floor -1),",
                                        CLEAR_YOUR_MIND);
                            case 3:
                                return BreathingWalls("go back, take the elevator or ");
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
                        return DifferentSizes("the high and fragile tone", "the tone becomes " +
                                "louder, brighter and sometimes, although not very often, even a " +
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
                        return AgitatedRubbing("the squeaks and bursts of noise from before " +
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
            if((progress[0]==false && progress[10]==true && progress[11]==true) ||
                    (progress[7]==false && progress[15]==true && progress[18]==true)) {
                next_texts.remove(Integer.valueOf(9));
            }
            if(progress[0]==false && progress[9]==true && progress[11]==true) {
                next_texts.remove(Integer.valueOf(10));
            }
            if(progress[0]==false && progress[9]==true && progress[10]==true) {
                next_texts.remove(Integer.valueOf(11));
            }
            if((progress[1]==false && progress[17]==true) ||
                    (progress[3]==false && progress[12]==true && progress[13]==true)) {
                next_texts.remove(Integer.valueOf(14));
            }
            if((progress[1]==false && progress[14]==true) ||
                    (progress[2]==false && progress[6]==false && progress[12]==true && progress[13]
                            ==true)) {
                next_texts.remove(Integer.valueOf(17));
            }
            if(progress[2]==false && progress[6]==false && progress[17]==true && progress[19]==
                    true) {
                next_texts.remove(Integer.valueOf(16));
            }
            if(progress[2]==false && progress[6]==false && progress[16]==true && progress[17]==
                    true) {
                next_texts.remove(Integer.valueOf(19));
            }
            if(progress[2]==false && progress[7]==false && progress[9]==true && progress[18]==
                    true) {
                next_texts.remove(Integer.valueOf(15));
            }
            if(progress[7]==false && progress[9]==true && progress[15]==true) {
                next_texts.remove(Integer.valueOf(18));
            }
            if(progress[3]==false && progress[13]==true && progress[14]==true) {
                next_texts.remove(Integer.valueOf(12));
            }
            if(progress[3]==false && progress[12]==true && progress[14]==true) {
                next_texts.remove(Integer.valueOf(13));
            }
        }
        return next_texts;
    }

}