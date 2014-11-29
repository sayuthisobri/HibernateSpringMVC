package com.sayuthi.common;

/**
 * Muhammad Sayuthi Bin Mohd Sobri
 * chronix91@gmail.com
 */
public class Openshift {
    public static enum Dir {
        HOME("OPENSHIFT_HOMEDIR"),
        DATA("OPENSHIFT_DATA_DIR"),
        REPO("OPENSHIFT_REPO_DIR"),
        TMP("OPENSHIFT_TMP_DIR"),
        LOG("OPENSHIFT_LOG_DIR");
        private String val;

        Dir(String val) {
            this.val = val;
        }

        public String getValue() {
            return System.getenv(this.val);
        }

        @Override
        public String toString() {
            return System.getenv(this.val);
        }
    }

    public static enum DB {
        URL("OPENSHIFT_MYSQL_DB_URL"),
        USER("OPENSHIFT_MYSQL_DB_USERNAME"),
        PASSWORD("OPENSHIFT_MYSQL_DB_PASSWORD"),
        HOST("OPENSHIFT_MYSQL_DB_HOST"),
        PORT("OPENSHIFT_MYSQL_DB_PORT");

        private String val;

        DB(String val) {
            this.val = val;
        }

        public String getValue() {
            return System.getenv(this.val);
        }

        @Override
        public String toString() {
            return System.getenv(this.val);
        }
    }
}
