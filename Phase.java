/**
 * Game plases, lovingly known as `fase` in the code. The game is always in one of these phases.
 * The game phase controls what the game renders and how it responds to inputs.
 * 
 * All legacy fase codes are listed for reference. New phases you may add do not need this.
 * 
 * @author Jacherr
 */
public enum Phase {
    /**
     * -8000 (saves the game and switches to 10 (used after beating a stage))
    */ 
    SAVEGAME,
    /**
     * -205 - really unsure but seems to just hand over to POSTGAME? this might be able to be removed (TODO)
     */
    POSTGAMEHANDOVER,
    /**
     * -9 - loads music and "fly-in" for car select before switching to CARSELECT
     */
    CARSELECTTRIGGER,
    /**
     * -8 - shown when you try and instant replay too early
     */
    NOTENOUGHREPLAYDATA,
    /**
     * -7
     */
    PAUSEMENU,
    /**
     * -6 - this takes a screenshot of the current screen in order to display it in the background of pause, then goes to PAUSE.
     * may also be used for other background screenshots such as POSTGAME
     */
    PAUSETRIGGER,
    /**
     * -5 - final static screen after beating/losing a stage
     */
    POSTGAME,
    /**
     * -4 - responsible for fading from gameplay to the POSTGAME
     */
    POSTGAMEFADEOUT,
    /**
     * -3 - used after a stage is concluded (if there is one, there isn't always)
     */
    GAMEHIGHLIGHT,
    /**
     * -2 - when the game freezes and pans around an event such as getting wasted or a stunt during a GAMEHIGHLIGHT or INSTANTREPLAY
     */
    CAUGHTHIGHLIGHT,
    /**
     * -1
     */
    INSTANTREPLAY,
    /**
     * 0 - actually playing a stage
     */
    INGAME,
    /**
     * 1
     */
    STAGESELECT,
    /**
     * 2 - seems to be set to this to initialise the spinning reveal of a track?
     */
    STAGESELECTTRIGGER,
    /**
     * 3
     */
    ERRORLOADINGSTAGE,
    /**
     * 4
     */
    LOCKEDSTAGE,
    /**
     * 5 - this seems to trigger loading of game music before switching to PREGAME
     */
    PREGAMEMUSIC,
    /**
     * 6 - the screen that appears when you select a stage with any tips etc.
     */
    PREGAME,
    /**
     * 7
     */
    CARSELECT,
    /**
     * 8
     */
    CREDITS,
    /**
     * 9 - SEEMS to be related to the "click here to start" screen before handing over to MAINMENU
     */
    AWAITLOADDISMISSAL,
    /**
     * 10
     */
    MAINMENU,
    /**
     * 11
     */
    INSTRUCTIONS,
    /**
     * 58 - runs before stage select and seem to do some debug checks for player count before switching to STAGESELECTTRIGGER
     */
    NPLAYERSCHECK,
    /**
     * 111 - this is the phase the game launches with
     */
    LOADING,
    /*
     * 176 - draws the 3D environment when necessary
     */
    DRAWENVIRONMENT,
    /**
     * 205 - saves the last selected car after loading a track then hands to PREGAMEMUSIC
     */
    SELECTEDCARSAVE, 
    /**
     * 9000 - hidden settings menu (may be removed)
     */
    CUSTOMSETTINGS,
    /**
     * 9001 - for loading a sage (custom)
     */
    LOADSTAGE
}
