package com.xmr.utils.nineteen;

public enum Day {
        MONDAY("周一"),
        TUESDAT("周二"),
        SUNDAY("周三");
        String des;
        private Day(String des){
                this.des=des;
        }

        public String get(){
                return des;
        }
}
