package demo;
 class Toyota extends CarAbstraction{
    public Toyota(IAudio iAudio){
        super(iAudio);
    }

    @Override
    public void showInfo() {
        System  .out.println("Toyota with:"+iAudio.getAudioSystem());

    }


}
