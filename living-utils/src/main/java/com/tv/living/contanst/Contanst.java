package com.tv.living.contanst;

public interface Contanst {


    enum STATE {


         DISABLE(0),

         ENABLE(1),
        ;

        private Integer code;

        STATE(int code) {
            this.code = code;
        }

        public Integer code() {
            return code;
        }
    }

}
