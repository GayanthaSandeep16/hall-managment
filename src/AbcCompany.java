abstract class AbcCompany {
        private Hall hallList[];
        private User userList[];
        private Admin adminList[];
        private int hallCount;

        public Hall[] getHallList() {
                return hallList;
        }

        public void setHallList(Hall[] hallList) {
                this.hallList = hallList;
        }

        public User[] getUserList() {
                return userList;
        }

        public void setUserList(User[] userList) {
                this.userList = userList;
        }

        public Admin[] getAdminList() {
                return adminList;
        }

        public void setAdminList(Admin[] adminList) {
                this.adminList = adminList;
        }

        public int getHallCount() {
                return hallCount;
        }

        public void setHallCount(int hallCount) {
                this.hallCount = hallCount;
        }
}
