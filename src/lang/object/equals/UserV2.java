package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2)obj; // 다운캐스팅 안하면 obj에는 id가 없어서 안된다.
        return id.equals(user.id); // string 끼리의 비교는 eqauls를 써야 함
    }
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id); // 동일성을 구현한 것
    }
}
